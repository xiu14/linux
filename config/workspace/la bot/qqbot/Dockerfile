FROM python:3.9-slim

WORKDIR /app

# 设置时区
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' > /etc/timezone

# 安装依赖
COPY requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

# 代码在运行时通过 Volume 挂载，这里不需要 COPY
# 但为了构建镜像时有基础环境，保持 WORKDIR

CMD ["python", "qqbot.py"]
