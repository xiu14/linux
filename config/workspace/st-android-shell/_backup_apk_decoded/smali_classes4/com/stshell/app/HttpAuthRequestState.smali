.class final Lcom/stshell/app/HttpAuthRequestState;
.super Ljava/lang/Object;
.source "MainActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0082\u0008\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J)\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stshell/app/HttpAuthRequestState;",
        "",
        "host",
        "",
        "realm",
        "handler",
        "Landroid/webkit/HttpAuthHandler;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Landroid/webkit/HttpAuthHandler;)V",
        "getHost",
        "()Ljava/lang/String;",
        "getRealm",
        "getHandler",
        "()Landroid/webkit/HttpAuthHandler;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "app_debug"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final handler:Landroid/webkit/HttpAuthHandler;

.field private final host:Ljava/lang/String;

.field private final realm:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/webkit/HttpAuthHandler;)V
    .locals 1
    .param p1, "host"    # Ljava/lang/String;
    .param p2, "realm"    # Ljava/lang/String;
    .param p3, "handler"    # Landroid/webkit/HttpAuthHandler;

    const-string v0, "host"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 162
    iput-object p1, p0, Lcom/stshell/app/HttpAuthRequestState;->host:Ljava/lang/String;

    .line 163
    iput-object p2, p0, Lcom/stshell/app/HttpAuthRequestState;->realm:Ljava/lang/String;

    .line 164
    iput-object p3, p0, Lcom/stshell/app/HttpAuthRequestState;->handler:Landroid/webkit/HttpAuthHandler;

    .line 161
    return-void
.end method

.method public static synthetic copy$default(Lcom/stshell/app/HttpAuthRequestState;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/HttpAuthHandler;ILjava/lang/Object;)Lcom/stshell/app/HttpAuthRequestState;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stshell/app/HttpAuthRequestState;->host:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stshell/app/HttpAuthRequestState;->realm:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stshell/app/HttpAuthRequestState;->handler:Landroid/webkit/HttpAuthHandler;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stshell/app/HttpAuthRequestState;->copy(Ljava/lang/String;Ljava/lang/String;Landroid/webkit/HttpAuthHandler;)Lcom/stshell/app/HttpAuthRequestState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stshell/app/HttpAuthRequestState;->host:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stshell/app/HttpAuthRequestState;->realm:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Landroid/webkit/HttpAuthHandler;
    .locals 1

    iget-object v0, p0, Lcom/stshell/app/HttpAuthRequestState;->handler:Landroid/webkit/HttpAuthHandler;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Landroid/webkit/HttpAuthHandler;)Lcom/stshell/app/HttpAuthRequestState;
    .locals 1

    const-string v0, "host"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stshell/app/HttpAuthRequestState;

    invoke-direct {v0, p1, p2, p3}, Lcom/stshell/app/HttpAuthRequestState;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/webkit/HttpAuthHandler;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stshell/app/HttpAuthRequestState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/stshell/app/HttpAuthRequestState;

    iget-object v3, p0, Lcom/stshell/app/HttpAuthRequestState;->host:Ljava/lang/String;

    iget-object v4, v1, Lcom/stshell/app/HttpAuthRequestState;->host:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    :cond_2
    iget-object v3, p0, Lcom/stshell/app/HttpAuthRequestState;->realm:Ljava/lang/String;

    iget-object v4, v1, Lcom/stshell/app/HttpAuthRequestState;->realm:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    return v2

    :cond_3
    iget-object v3, p0, Lcom/stshell/app/HttpAuthRequestState;->handler:Landroid/webkit/HttpAuthHandler;

    iget-object v1, v1, Lcom/stshell/app/HttpAuthRequestState;->handler:Landroid/webkit/HttpAuthHandler;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getHandler()Landroid/webkit/HttpAuthHandler;
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/stshell/app/HttpAuthRequestState;->handler:Landroid/webkit/HttpAuthHandler;

    return-object v0
.end method

.method public final getHost()Ljava/lang/String;
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/stshell/app/HttpAuthRequestState;->host:Ljava/lang/String;

    return-object v0
.end method

.method public final getRealm()Ljava/lang/String;
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/stshell/app/HttpAuthRequestState;->realm:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stshell/app/HttpAuthRequestState;->host:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/stshell/app/HttpAuthRequestState;->realm:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/stshell/app/HttpAuthRequestState;->realm:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/stshell/app/HttpAuthRequestState;->handler:Landroid/webkit/HttpAuthHandler;

    invoke-virtual {v2}, Landroid/webkit/HttpAuthHandler;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stshell/app/HttpAuthRequestState;->host:Ljava/lang/String;

    iget-object v1, p0, Lcom/stshell/app/HttpAuthRequestState;->realm:Ljava/lang/String;

    iget-object v2, p0, Lcom/stshell/app/HttpAuthRequestState;->handler:Landroid/webkit/HttpAuthHandler;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "HttpAuthRequestState(host="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", realm="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", handler="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
