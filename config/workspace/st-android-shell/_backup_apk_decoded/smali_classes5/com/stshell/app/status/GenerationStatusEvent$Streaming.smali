.class public final Lcom/stshell/app/status/GenerationStatusEvent$Streaming;
.super Ljava/lang/Object;
.source "GenerationStatusEvent.kt"

# interfaces
.implements Lcom/stshell/app/status/GenerationStatusEvent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stshell/app/status/GenerationStatusEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Streaming"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ0\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/stshell/app/status/GenerationStatusEvent$Streaming;",
        "Lcom/stshell/app/status/GenerationStatusEvent;",
        "at",
        "",
        "preview",
        "",
        "length",
        "",
        "<init>",
        "(JLjava/lang/String;Ljava/lang/Integer;)V",
        "getAt",
        "()J",
        "getPreview",
        "()Ljava/lang/String;",
        "getLength",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "component1",
        "component2",
        "component3",
        "copy",
        "(JLjava/lang/String;Ljava/lang/Integer;)Lcom/stshell/app/status/GenerationStatusEvent$Streaming;",
        "equals",
        "",
        "other",
        "",
        "hashCode",
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


# static fields
.field public static final $stable:I


# instance fields
.field private final at:J

.field private final length:Ljava/lang/Integer;

.field private final preview:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/Integer;)V
    .locals 0
    .param p1, "at"    # J
    .param p3, "preview"    # Ljava/lang/String;
    .param p4, "length"    # Ljava/lang/Integer;

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-wide p1, p0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->at:J

    .line 19
    iput-object p3, p0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->preview:Ljava/lang/String;

    .line 20
    iput-object p4, p0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->length:Ljava/lang/Integer;

    .line 17
    return-void
.end method

.method public static synthetic copy$default(Lcom/stshell/app/status/GenerationStatusEvent$Streaming;JLjava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/stshell/app/status/GenerationStatusEvent$Streaming;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-wide p1, p0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->at:J

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p3, p0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->preview:Ljava/lang/String;

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-object p4, p0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->length:Ljava/lang/Integer;

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->copy(JLjava/lang/String;Ljava/lang/Integer;)Lcom/stshell/app/status/GenerationStatusEvent$Streaming;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->at:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->preview:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->length:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(JLjava/lang/String;Ljava/lang/Integer;)Lcom/stshell/app/status/GenerationStatusEvent$Streaming;
    .locals 1

    new-instance v0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;-><init>(JLjava/lang/String;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;

    iget-wide v3, p0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->at:J

    iget-wide v5, v1, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->at:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_2

    return v2

    :cond_2
    iget-object v3, p0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->preview:Ljava/lang/String;

    iget-object v4, v1, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->preview:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    return v2

    :cond_3
    iget-object v3, p0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->length:Ljava/lang/Integer;

    iget-object v1, v1, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->length:Ljava/lang/Integer;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAt()J
    .locals 2

    .line 18
    iget-wide v0, p0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->at:J

    return-wide v0
.end method

.method public final getLength()Ljava/lang/Integer;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->length:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getPreview()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->preview:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->at:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->preview:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->preview:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->length:Ljava/lang/Integer;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->length:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-wide v0, p0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->at:J

    iget-object v2, p0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->preview:Ljava/lang/String;

    iget-object v3, p0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->length:Ljava/lang/Integer;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Streaming(at="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", preview="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", length="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
