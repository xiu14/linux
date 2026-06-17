using System.Net.Http.Headers;
using System.Text;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;

namespace Libala.CompanionGuide;

internal sealed class ApiChatClient : IDisposable
{
    private readonly ModConfig config;
    private readonly HttpClient httpClient;

    public ApiChatClient(ModConfig config)
    {
        this.config = config;
        this.httpClient = new HttpClient
        {
            Timeout = TimeSpan.FromSeconds(Math.Clamp(config.TimeoutSeconds, 10, 180))
        };
    }

    public async Task<string> CompleteAsync(IEnumerable<ChatMessage> messages, CancellationToken cancellationToken)
    {
        if (string.IsNullOrWhiteSpace(this.config.ApiKey))
            throw new InvalidOperationException("请先在 config.json 中填写 ApiKey。");

        JObject body = new()
        {
            ["model"] = this.config.Model,
            ["temperature"] = this.config.Temperature,
            ["messages"] = new JArray(messages.Select(message => new JObject
            {
                ["role"] = message.Role,
                ["content"] = message.Content
            }))
        };
        using HttpRequestMessage request = new(HttpMethod.Post, $"{this.config.ApiBaseUrl.TrimEnd('/')}/chat/completions")
        {
            Content = new StringContent(body.ToString(Formatting.None), Encoding.UTF8, "application/json")
        };
        request.Headers.Authorization = new AuthenticationHeaderValue("Bearer", this.config.ApiKey);

        using HttpResponseMessage response = await this.httpClient.SendAsync(request, cancellationToken);
        string responseText = await response.Content.ReadAsStringAsync(cancellationToken);
        if (!response.IsSuccessStatusCode)
            throw new InvalidOperationException($"API 返回 {(int)response.StatusCode}: {Shorten(responseText)}");

        string? reply = JObject.Parse(responseText).SelectToken("choices[0].message.content")?.Value<string>();
        if (string.IsNullOrWhiteSpace(reply))
            throw new InvalidOperationException("API 返回中没有 choices[0].message.content。");

        return reply.Trim();
    }

    public void Dispose()
    {
        this.httpClient.Dispose();
    }

    private static string Shorten(string value)
    {
        value = value.Replace("\r", " ").Replace("\n", " ").Trim();
        return value.Length > 140 ? value[..140] + "..." : value;
    }
}
