class AListClient {
  constructor(config) {
    this.config = config;
    this.tokenCache = null;
    this.tokenFetchedAt = 0;
    this.cacheTtlMs = 30 * 60 * 1000;
    this.directoryCache = new Map();
    this.fileCache = new Map();
  }

  async getToken() {
    if (this.config.alistToken) {
      return this.config.alistToken;
    }

    if (!this.config.alistUsername || !this.config.alistPassword) {
      const error = new Error("Missing AList credentials. Set ALIST_TOKEN or ALIST_USERNAME/ALIST_PASSWORD.");
      error.statusCode = 500;
      throw error;
    }

    const isFresh = this.tokenCache && Date.now() - this.tokenFetchedAt < 47 * 60 * 60 * 1000;
    if (isFresh) {
      return this.tokenCache;
    }

    const body = {
      username: this.config.alistUsername,
      password: this.config.alistPassword
    };

    const result = await this.request("/api/auth/login", {
      method: "POST",
      body,
      withAuth: false
    });

    this.tokenCache = result.data.token;
    this.tokenFetchedAt = Date.now();
    return this.tokenCache;
  }

  async request(endpoint, { method = "POST", body, withAuth = true, responseType = "json", headers = {} } = {}) {
    if (!this.config.alistBaseUrl) {
      const error = new Error("Missing ALIST_BASE_URL in environment configuration.");
      error.statusCode = 500;
      throw error;
    }

    const requestHeaders = {
      ...headers
    };

    if (body !== undefined) {
      requestHeaders["Content-Type"] = "application/json";
    }

    if (withAuth) {
      requestHeaders.Authorization = await this.getToken();
    }

    const response = await fetch(`${this.config.alistBaseUrl}${endpoint}`, {
      method,
      headers: requestHeaders,
      body: body !== undefined ? JSON.stringify(body) : undefined
    });

    if (responseType === "stream") {
      return response;
    }

    const payload = await response.json().catch(() => ({}));

    if (!response.ok || payload.code >= 400) {
      const message = payload.message || `AList request failed with status ${response.status}`;
      const error = new Error(message);
      error.statusCode = payload.code >= 400 ? payload.code : (response.status || 502);
      error.payload = payload;
      throw error;
    }

    return payload;
  }

  async list(pathname) {
    const cacheKey = pathname;
    const cached = this.directoryCache.get(cacheKey);

    if (cached && Date.now() - cached.timestamp < this.cacheTtlMs) {
      return cached.data;
    }

    const result = await this.request("/api/fs/list", {
      body: {
        path: pathname,
        password: "",
        page: 1,
        per_page: 0,
        refresh: false
      }
    });

    this.directoryCache.set(cacheKey, {
      timestamp: Date.now(),
      data: result.data
    });

    return result.data;
  }

  async get(pathname) {
    const cached = this.fileCache.get(pathname);

    if (cached && Date.now() - cached.timestamp < this.cacheTtlMs) {
      return cached.data;
    }

    const result = await this.request("/api/fs/get", {
      body: {
        path: pathname,
        password: "",
        page: 1,
        per_page: 0,
        refresh: false
      }
    });

    this.fileCache.set(pathname, {
      timestamp: Date.now(),
      data: result.data
    });

    return result.data;
  }

  resolveUrl(targetUrl) {
    return new URL(targetUrl, this.config.alistBaseUrl).toString();
  }
}

module.exports = {
  AListClient
};
