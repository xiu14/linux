.class public final Lcom/stshell/app/status/GenerationSession;
.super Ljava/lang/Object;
.source "GenerationStatusController.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015JR\u0010\u001d\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\u0008\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\nH\u00d6\u0001J\t\u0010#\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000eR\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006$"
    }
    d2 = {
        "Lcom/stshell/app/status/GenerationSession;",
        "",
        "startedAt",
        "",
        "href",
        "",
        "type",
        "lastHeartbeatAt",
        "lastPreview",
        "outputLength",
        "",
        "<init>",
        "(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;)V",
        "getStartedAt",
        "()J",
        "getHref",
        "()Ljava/lang/String;",
        "getType",
        "getLastHeartbeatAt",
        "getLastPreview",
        "getOutputLength",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;)Lcom/stshell/app/status/GenerationSession;",
        "equals",
        "",
        "other",
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
.field private final href:Ljava/lang/String;

.field private final lastHeartbeatAt:J

.field private final lastPreview:Ljava/lang/String;

.field private final outputLength:Ljava/lang/Integer;

.field private final startedAt:J

.field private final type:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;)V
    .locals 0
    .param p1, "startedAt"    # J
    .param p3, "href"    # Ljava/lang/String;
    .param p4, "type"    # Ljava/lang/String;
    .param p5, "lastHeartbeatAt"    # J
    .param p7, "lastPreview"    # Ljava/lang/String;
    .param p8, "outputLength"    # Ljava/lang/Integer;

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-wide p1, p0, Lcom/stshell/app/status/GenerationSession;->startedAt:J

    .line 5
    iput-object p3, p0, Lcom/stshell/app/status/GenerationSession;->href:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/stshell/app/status/GenerationSession;->type:Ljava/lang/String;

    .line 7
    iput-wide p5, p0, Lcom/stshell/app/status/GenerationSession;->lastHeartbeatAt:J

    .line 8
    iput-object p7, p0, Lcom/stshell/app/status/GenerationSession;->lastPreview:Ljava/lang/String;

    .line 9
    iput-object p8, p0, Lcom/stshell/app/status/GenerationSession;->outputLength:Ljava/lang/Integer;

    .line 3
    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    .line 3
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_0

    .line 7
    move-wide p5, p1

    .line 3
    :cond_0
    and-int/lit8 p10, p9, 0x10

    const/4 v0, 0x0

    if-eqz p10, :cond_1

    .line 8
    move-object p7, v0

    .line 3
    :cond_1
    and-int/lit8 p9, p9, 0x20

    if-eqz p9, :cond_2

    .line 9
    move-object p9, v0

    goto :goto_0

    .line 3
    :cond_2
    move-object p9, p8

    :goto_0
    move-object p8, p7

    move-wide p6, p5

    move-object p5, p4

    move-object p4, p3

    move-wide p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p9}, Lcom/stshell/app/status/GenerationSession;-><init>(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;)V

    .line 10
    return-void
.end method

.method public static synthetic copy$default(Lcom/stshell/app/status/GenerationSession;JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/stshell/app/status/GenerationSession;
    .locals 9

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lcom/stshell/app/status/GenerationSession;->startedAt:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p9, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/stshell/app/status/GenerationSession;->href:Ljava/lang/String;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p9, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lcom/stshell/app/status/GenerationSession;->type:Ljava/lang/String;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, p9, 0x8

    if-eqz p1, :cond_3

    iget-wide p5, p0, Lcom/stshell/app/status/GenerationSession;->lastHeartbeatAt:J

    :cond_3
    move-wide v5, p5

    and-int/lit8 p1, p9, 0x10

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/stshell/app/status/GenerationSession;->lastPreview:Ljava/lang/String;

    move-object v7, p1

    goto :goto_0

    :cond_4
    move-object/from16 v7, p7

    :goto_0
    and-int/lit8 p1, p9, 0x20

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/stshell/app/status/GenerationSession;->outputLength:Ljava/lang/Integer;

    move-object v8, p1

    goto :goto_1

    :cond_5
    move-object/from16 v8, p8

    :goto_1
    move-object v0, p0

    invoke-virtual/range {v0 .. v8}, Lcom/stshell/app/status/GenerationSession;->copy(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;)Lcom/stshell/app/status/GenerationSession;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/stshell/app/status/GenerationSession;->startedAt:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stshell/app/status/GenerationSession;->href:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stshell/app/status/GenerationSession;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lcom/stshell/app/status/GenerationSession;->lastHeartbeatAt:J

    return-wide v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stshell/app/status/GenerationSession;->lastPreview:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stshell/app/status/GenerationSession;->outputLength:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;)Lcom/stshell/app/status/GenerationSession;
    .locals 9

    new-instance v0, Lcom/stshell/app/status/GenerationSession;

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-wide v5, p5

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/stshell/app/status/GenerationSession;-><init>(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stshell/app/status/GenerationSession;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/stshell/app/status/GenerationSession;

    iget-wide v3, p0, Lcom/stshell/app/status/GenerationSession;->startedAt:J

    iget-wide v5, v1, Lcom/stshell/app/status/GenerationSession;->startedAt:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_2

    return v2

    :cond_2
    iget-object v3, p0, Lcom/stshell/app/status/GenerationSession;->href:Ljava/lang/String;

    iget-object v4, v1, Lcom/stshell/app/status/GenerationSession;->href:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    return v2

    :cond_3
    iget-object v3, p0, Lcom/stshell/app/status/GenerationSession;->type:Ljava/lang/String;

    iget-object v4, v1, Lcom/stshell/app/status/GenerationSession;->type:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/stshell/app/status/GenerationSession;->lastHeartbeatAt:J

    iget-wide v5, v1, Lcom/stshell/app/status/GenerationSession;->lastHeartbeatAt:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_5

    return v2

    :cond_5
    iget-object v3, p0, Lcom/stshell/app/status/GenerationSession;->lastPreview:Ljava/lang/String;

    iget-object v4, v1, Lcom/stshell/app/status/GenerationSession;->lastPreview:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    return v2

    :cond_6
    iget-object v3, p0, Lcom/stshell/app/status/GenerationSession;->outputLength:Ljava/lang/Integer;

    iget-object v1, v1, Lcom/stshell/app/status/GenerationSession;->outputLength:Ljava/lang/Integer;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getHref()Ljava/lang/String;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/stshell/app/status/GenerationSession;->href:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastHeartbeatAt()J
    .locals 2

    .line 7
    iget-wide v0, p0, Lcom/stshell/app/status/GenerationSession;->lastHeartbeatAt:J

    return-wide v0
.end method

.method public final getLastPreview()Ljava/lang/String;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/stshell/app/status/GenerationSession;->lastPreview:Ljava/lang/String;

    return-object v0
.end method

.method public final getOutputLength()Ljava/lang/Integer;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/stshell/app/status/GenerationSession;->outputLength:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getStartedAt()J
    .locals 2

    .line 4
    iget-wide v0, p0, Lcom/stshell/app/status/GenerationSession;->startedAt:J

    return-wide v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/stshell/app/status/GenerationSession;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 6

    iget-wide v0, p0, Lcom/stshell/app/status/GenerationSession;->startedAt:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/stshell/app/status/GenerationSession;->href:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/stshell/app/status/GenerationSession;->href:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/stshell/app/status/GenerationSession;->type:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lcom/stshell/app/status/GenerationSession;->type:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-wide v4, p0, Lcom/stshell/app/status/GenerationSession;->lastHeartbeatAt:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/stshell/app/status/GenerationSession;->lastPreview:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    iget-object v2, p0, Lcom/stshell/app/status/GenerationSession;->lastPreview:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/stshell/app/status/GenerationSession;->outputLength:Ljava/lang/Integer;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    iget-object v2, p0, Lcom/stshell/app/status/GenerationSession;->outputLength:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v1, v3

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-wide v0, p0, Lcom/stshell/app/status/GenerationSession;->startedAt:J

    iget-object v2, p0, Lcom/stshell/app/status/GenerationSession;->href:Ljava/lang/String;

    iget-object v3, p0, Lcom/stshell/app/status/GenerationSession;->type:Ljava/lang/String;

    iget-wide v4, p0, Lcom/stshell/app/status/GenerationSession;->lastHeartbeatAt:J

    iget-object v6, p0, Lcom/stshell/app/status/GenerationSession;->lastPreview:Ljava/lang/String;

    iget-object v7, p0, Lcom/stshell/app/status/GenerationSession;->outputLength:Ljava/lang/Integer;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "GenerationSession(startedAt="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", href="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastHeartbeatAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastPreview="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", outputLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
