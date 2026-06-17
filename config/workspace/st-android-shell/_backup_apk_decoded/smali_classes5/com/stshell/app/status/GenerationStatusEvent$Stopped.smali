.class public final Lcom/stshell/app/status/GenerationStatusEvent$Stopped;
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
    name = "Stopped"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stshell/app/status/GenerationStatusEvent$Stopped;",
        "Lcom/stshell/app/status/GenerationStatusEvent;",
        "at",
        "",
        "href",
        "",
        "<init>",
        "(JLjava/lang/String;)V",
        "getAt",
        "()J",
        "getHref",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "",
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


# static fields
.field public static final $stable:I


# instance fields
.field private final at:J

.field private final href:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;)V
    .locals 0
    .param p1, "at"    # J
    .param p3, "href"    # Ljava/lang/String;

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-wide p1, p0, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;->at:J

    .line 31
    iput-object p3, p0, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;->href:Ljava/lang/String;

    .line 29
    return-void
.end method

.method public static synthetic copy$default(Lcom/stshell/app/status/GenerationStatusEvent$Stopped;JLjava/lang/String;ILjava/lang/Object;)Lcom/stshell/app/status/GenerationStatusEvent$Stopped;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-wide p1, p0, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;->at:J

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    iget-object p3, p0, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;->href:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;->copy(JLjava/lang/String;)Lcom/stshell/app/status/GenerationStatusEvent$Stopped;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;->at:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;->href:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(JLjava/lang/String;)Lcom/stshell/app/status/GenerationStatusEvent$Stopped;
    .locals 1

    new-instance v0, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;

    invoke-direct {v0, p1, p2, p3}, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;-><init>(JLjava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;

    iget-wide v3, p0, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;->at:J

    iget-wide v5, v1, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;->at:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_2

    return v2

    :cond_2
    iget-object v3, p0, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;->href:Ljava/lang/String;

    iget-object v1, v1, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;->href:Ljava/lang/String;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getAt()J
    .locals 2

    .line 30
    iget-wide v0, p0, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;->at:J

    return-wide v0
.end method

.method public final getHref()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;->href:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;->at:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;->href:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;->href:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-wide v0, p0, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;->at:J

    iget-object v2, p0, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;->href:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Stopped(at="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", href="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
