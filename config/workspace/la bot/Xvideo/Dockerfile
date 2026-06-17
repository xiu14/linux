FROM python:3.10-slim

# Install system dependencies
# ffmpeg is required for yt-dlp to merge video and audio
RUN apt-get update && \
    apt-get install -y --no-install-recommends ffmpeg curl && \
    rm -rf /var/lib/apt/lists/*

# Set working directory
WORKDIR /app

# Copy requirements and install
COPY requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

# Copy application code
COPY Xvideo_bot.py .

# Command to run
CMD ["python", "Xvideo_bot.py"]
