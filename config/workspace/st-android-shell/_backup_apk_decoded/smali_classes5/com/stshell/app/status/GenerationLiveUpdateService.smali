.class public final Lcom/stshell/app/status/GenerationLiveUpdateService;
.super Landroid/app/Service;
.source "GenerationLiveUpdateService.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stshell/app/status/GenerationLiveUpdateService$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGenerationLiveUpdateService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GenerationLiveUpdateService.kt\ncom/stshell/app/status/GenerationLiveUpdateService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,329:1\n1#2:330\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0010\r\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 22\u00020\u0001:\u00012B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0006\u001a\u00020\u0007H\u0016J\u0014\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\"\u0010\u000c\u001a\u00020\r2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0014\u001a\u00020\rH\u0002J\u0008\u0010\u001b\u001a\u00020\u0007H\u0002J\u0008\u0010\u001c\u001a\u00020\u001dH\u0002J\u001a\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 2\u0008\u0008\u0002\u0010!\u001a\u00020\u0016H\u0002J\u0008\u0010\"\u001a\u00020\u0007H\u0002J\u0008\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0011H\u0002J\u0018\u0010\'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0016H\u0002J \u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u0016H\u0002J \u0010.\u001a\u00020\u00072\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\rH\u0002J \u0010/\u001a\u00020\u00072\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u000200H\u0002J\u0008\u00101\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"
    }
    d2 = {
        "Lcom/stshell/app/status/GenerationLiveUpdateService;",
        "Landroid/app/Service;",
        "<init>",
        "()V",
        "mainHandler",
        "Landroid/os/Handler;",
        "onCreate",
        "",
        "onBind",
        "Landroid/os/IBinder;",
        "intent",
        "Landroid/content/Intent;",
        "onStartCommand",
        "",
        "flags",
        "startId",
        "buildLiveNotification",
        "Landroid/app/Notification;",
        "text",
        "",
        "progress",
        "completed",
        "",
        "buildFallbackNotification",
        "title",
        "buildProgressStyle",
        "Landroid/app/Notification$Style;",
        "ensureChannels",
        "createContentIntent",
        "Landroid/app/PendingIntent;",
        "scheduleStop",
        "delayMs",
        "",
        "removeForeground",
        "dismissPromotedLiveUpdate",
        "notificationManager",
        "Landroid/app/NotificationManager;",
        "startLiveForeground",
        "notification",
        "logPromotionState",
        "requestPromoted",
        "invokeBooleanMethod",
        "target",
        "",
        "methodName",
        "value",
        "invokeIntMethod",
        "invokeCharSequenceMethod",
        "",
        "buildDismissedNotification",
        "Companion",
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

.field private static final ACTION_COMPLETE:Ljava/lang/String; = "com.stshell.app.action.LIVE_COMPLETE"

.field private static final ACTION_HEARTBEAT:Ljava/lang/String; = "com.stshell.app.action.LIVE_HEARTBEAT"

.field private static final ACTION_START:Ljava/lang/String; = "com.stshell.app.action.LIVE_START"

.field private static final ACTION_STOP:Ljava/lang/String; = "com.stshell.app.action.LIVE_STOP"

.field private static final COMPLETED_DISPLAY_MS:J = 0x2710L

.field public static final Companion:Lcom/stshell/app/status/GenerationLiveUpdateService$Companion;

.field private static final DEFAULT_DISMISS_DELAY_MS:J = 0x1f40L

.field private static final DISMISS_PROPAGATION_MS:J = 0x12cL

.field private static final EXTRA_TEXT:Ljava/lang/String; = "extra_text"

.field private static final FALLBACK_CHANNEL_ID:Ljava/lang/String; = "st_generation_status"

.field private static final LIVE_CHANNEL_ID:Ljava/lang/String; = "st_live_update_v2"

.field private static final LIVE_NOTIFICATION_ID:I = 0xbb9

.field private static final STOP_TOKEN:Ljava/lang/Object;


# instance fields
.field private final mainHandler:Landroid/os/Handler;


# direct methods
.method public static synthetic $r8$lambda$DhevFoWrAoJARRLmGTC-Hv7VdyY(Lcom/stshell/app/status/GenerationLiveUpdateService;)V
    .locals 0

    invoke-static {p0}, Lcom/stshell/app/status/GenerationLiveUpdateService;->dismissPromotedLiveUpdate$lambda$13(Lcom/stshell/app/status/GenerationLiveUpdateService;)V

    return-void
.end method

.method public static synthetic $r8$lambda$YlUXH9DU40LGpb0kTxHzD87OyB0(ZLcom/stshell/app/status/GenerationLiveUpdateService;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stshell/app/status/GenerationLiveUpdateService;->scheduleStop$lambda$12(ZLcom/stshell/app/status/GenerationLiveUpdateService;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stshell/app/status/GenerationLiveUpdateService$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stshell/app/status/GenerationLiveUpdateService$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stshell/app/status/GenerationLiveUpdateService;->Companion:Lcom/stshell/app/status/GenerationLiveUpdateService$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stshell/app/status/GenerationLiveUpdateService;->$stable:I

    .line 302
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stshell/app/status/GenerationLiveUpdateService;->STOP_TOKEN:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 23
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 24
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/stshell/app/status/GenerationLiveUpdateService;->mainHandler:Landroid/os/Handler;

    .line 23
    return-void
.end method

.method private final buildDismissedNotification()Landroid/app/Notification;
    .locals 7

    .line 267
    new-instance v0, Landroid/app/Notification$Builder;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-string v2, "st_live_update_v2"

    invoke-direct {v0, v1, v2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 268
    sget v1, Lcom/stshell/app/R$mipmap;->ic_launcher:I

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 269
    const-string v1, "#6F869A"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setColor(I)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 270
    const-string v1, "\u5df2\u5b8c\u6210"

    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 271
    const-string v2, "SillyTavern \u56de\u590d\u5b8c\u6210"

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 272
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 273
    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 274
    invoke-direct {p0}, Lcom/stshell/app/status/GenerationLiveUpdateService;->createContentIntent()Landroid/app/PendingIntent;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 275
    const-string v4, "status"

    invoke-virtual {v0, v4}, Landroid/app/Notification$Builder;->setCategory(Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 276
    invoke-virtual {v0, v2}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 277
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 278
    invoke-virtual {v0, v2}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 279
    const-wide/16 v4, 0x1

    invoke-virtual {v0, v4, v5}, Landroid/app/Notification$Builder;->setTimeoutAfter(J)Landroid/app/Notification$Builder;

    move-result-object v0

    const-string v2, "setTimeoutAfter(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 267
    nop

    .line 281
    .local v0, "builder":Landroid/app/Notification$Builder;
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    move-object v4, v2

    .local v4, "$this$buildDismissedNotification_u24lambda_u2419\\1":Landroid/os/Bundle;
    const/4 v5, 0x0

    .line 282
    .local v5, "$i$a$-apply-GenerationLiveUpdateService$buildDismissedNotification$extras$1\\1\\281\\0":I
    const-string v6, "android.requestPromotedOngoing"

    invoke-virtual {v4, v6, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 283
    nop

    .line 281
    .end local v4    # "$this$buildDismissedNotification_u24lambda_u2419\\1":Landroid/os/Bundle;
    .end local v5    # "$i$a$-apply-GenerationLiveUpdateService$buildDismissedNotification$extras$1\\1\\281\\0":I
    nop

    .line 284
    .local v2, "extras":Landroid/os/Bundle;
    invoke-virtual {v0, v2}, Landroid/app/Notification$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 285
    const-string v4, "setRequestPromotedOngoing"

    invoke-direct {p0, v0, v4, v3}, Lcom/stshell/app/status/GenerationLiveUpdateService;->invokeBooleanMethod(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 286
    const-string v3, "setShortCriticalText"

    check-cast v1, Ljava/lang/CharSequence;

    invoke-direct {p0, v0, v3, v1}, Lcom/stshell/app/status/GenerationLiveUpdateService;->invokeCharSequenceMethod(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 287
    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v1

    const-string v3, "build(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method private final buildFallbackNotification(Ljava/lang/String;Ljava/lang/String;)Landroid/app/Notification;
    .locals 4
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "text"    # Ljava/lang/String;

    .line 108
    new-instance v0, Landroid/app/Notification$Builder;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-string v2, "st_generation_status"

    invoke-direct {v0, v1, v2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 109
    sget v1, Lcom/stshell/app/R$mipmap;->ic_launcher:I

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 110
    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 111
    const-string v1, "SillyTavern \u72b6\u6001\u66f4\u65b0"

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 112
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 113
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 114
    invoke-direct {p0}, Lcom/stshell/app/status/GenerationLiveUpdateService;->createContentIntent()Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 115
    const-string v2, "status"

    invoke-virtual {v0, v2}, Landroid/app/Notification$Builder;->setCategory(Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 116
    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 117
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 118
    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 119
    const-wide/16 v1, 0x1f40

    invoke-virtual {v0, v1, v2}, Landroid/app/Notification$Builder;->setTimeoutAfter(J)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 120
    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    return-object v0
.end method

.method private final buildLiveNotification(Ljava/lang/String;IZ)Landroid/app/Notification;
    .locals 8
    .param p1, "text"    # Ljava/lang/String;
    .param p2, "progress"    # I
    .param p3, "completed"    # Z

    .line 72
    if-eqz p3, :cond_0

    const-string v0, "\u5df2\u5b8c\u6210"

    goto :goto_0

    :cond_0
    const-string v0, "\u751f\u6210\u4e2d"

    .line 73
    .local v0, "title":Ljava/lang/String;
    :goto_0
    if-eqz p3, :cond_1

    const-string v1, "SillyTavern \u56de\u590d\u5b8c\u6210"

    goto :goto_1

    :cond_1
    const-string v1, "SillyTavern \u6b63\u5728\u56de\u590d"

    .line 74
    .local v1, "body":Ljava/lang/String;
    :goto_1
    new-instance v2, Landroid/app/Notification$Builder;

    move-object v3, p0

    check-cast v3, Landroid/content/Context;

    const-string v4, "st_live_update_v2"

    invoke-direct {v2, v3, v4}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 75
    sget v3, Lcom/stshell/app/R$mipmap;->ic_launcher:I

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 76
    if-eqz p3, :cond_2

    const-string v3, "#6F869A"

    goto :goto_2

    :cond_2
    const-string v3, "#34C759"

    :goto_2
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setColor(I)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 77
    move-object v3, v0

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 78
    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 79
    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 80
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 81
    invoke-direct {p0}, Lcom/stshell/app/status/GenerationLiveUpdateService;->createContentIntent()Landroid/app/PendingIntent;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 82
    const-string v4, "progress"

    invoke-virtual {v2, v4}, Landroid/app/Notification$Builder;->setCategory(Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 83
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 84
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    move-result-object v2

    const-string v4, "setWhen(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    nop

    .line 86
    .local v2, "builder":Landroid/app/Notification$Builder;
    invoke-direct {p0, p2}, Lcom/stshell/app/status/GenerationLiveUpdateService;->buildProgressStyle(I)Landroid/app/Notification$Style;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 330
    .local v4, "it\\1":Landroid/app/Notification$Style;
    const/4 v5, 0x0

    .line 86
    .local v5, "$i$a$-let-GenerationLiveUpdateService$buildLiveNotification$1\\1\\86\\0":I
    invoke-virtual {v2, v4}, Landroid/app/Notification$Builder;->setStyle(Landroid/app/Notification$Style;)Landroid/app/Notification$Builder;

    .line 88
    .end local v4    # "it\\1":Landroid/app/Notification$Style;
    .end local v5    # "$i$a$-let-GenerationLiveUpdateService$buildLiveNotification$1\\1\\86\\0":I
    :cond_3
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    move-object v5, v4

    .local v5, "$this$buildLiveNotification_u24lambda_u245\\2":Landroid/os/Bundle;
    const/4 v6, 0x0

    .line 89
    .local v6, "$i$a$-apply-GenerationLiveUpdateService$buildLiveNotification$extras$1\\2\\88\\0":I
    const-string v7, "android.requestPromotedOngoing"

    invoke-virtual {v5, v7, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 90
    nop

    .line 88
    .end local v5    # "$this$buildLiveNotification_u24lambda_u245\\2":Landroid/os/Bundle;
    .end local v6    # "$i$a$-apply-GenerationLiveUpdateService$buildLiveNotification$extras$1\\2\\88\\0":I
    nop

    .line 91
    .local v4, "extras":Landroid/os/Bundle;
    invoke-virtual {v2, v4}, Landroid/app/Notification$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 92
    const-string v5, "setRequestPromotedOngoing"

    invoke-direct {p0, v2, v5, v3}, Lcom/stshell/app/status/GenerationLiveUpdateService;->invokeBooleanMethod(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 93
    const-string v5, "setShortCriticalText"

    move-object v6, p1

    check-cast v6, Ljava/lang/CharSequence;

    invoke-direct {p0, v2, v5, v6}, Lcom/stshell/app/status/GenerationLiveUpdateService;->invokeCharSequenceMethod(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 95
    if-eqz p3, :cond_4

    .line 96
    const-wide/16 v5, 0x2710

    invoke-virtual {v2, v5, v6}, Landroid/app/Notification$Builder;->setTimeoutAfter(J)Landroid/app/Notification$Builder;

    .line 99
    :cond_4
    invoke-virtual {v2}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v5

    const-string v6, "build(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .local v5, "notification":Landroid/app/Notification;
    invoke-direct {p0, v5, v3}, Lcom/stshell/app/status/GenerationLiveUpdateService;->logPromotionState(Landroid/app/Notification;Z)V

    .line 101
    return-object v5
.end method

.method private final buildProgressStyle(I)Landroid/app/Notification$Style;
    .locals 10
    .param p1, "progress"    # I

    .line 124
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/stshell/app/status/GenerationLiveUpdateService;

    .local v0, "$this$buildProgressStyle_u24lambda_u247\\1":Lcom/stshell/app/status/GenerationLiveUpdateService;
    const/4 v1, 0x0

    .line 125
    .local v1, "$i$a$-runCatching-GenerationLiveUpdateService$buildProgressStyle$1\\1\\124\\0":I
    new-instance v2, Landroid/app/Notification$ProgressStyle;

    invoke-direct {v2}, Landroid/app/Notification$ProgressStyle;-><init>()V

    .line 126
    .local v2, "style\\1":Landroid/app/Notification$ProgressStyle;
    const-string v3, "setStyledByProgress"

    const/4 v4, 0x1

    invoke-direct {v0, v2, v3, v4}, Lcom/stshell/app/status/GenerationLiveUpdateService;->invokeBooleanMethod(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 127
    const-string v3, "setProgress"

    invoke-direct {v0, v2, v3, p1}, Lcom/stshell/app/status/GenerationLiveUpdateService;->invokeIntMethod(Ljava/lang/Object;Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 128
    :try_start_1
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v3, v0

    .local v3, "$this$buildProgressStyle_u24lambda_u247_u24lambda_u246\\2":Lcom/stshell/app/status/GenerationLiveUpdateService;
    const/4 v5, 0x0

    .line 129
    .local v5, "$i$a$-runCatching-GenerationLiveUpdateService$buildProgressStyle$1$1\\2\\128\\1":I
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    .line 130
    const-string v7, "setProgressTrackerIcon"

    .line 131
    new-array v4, v4, [Ljava/lang/Class;

    const-class v8, Landroid/graphics/drawable/Icon;

    const/4 v9, 0x0

    aput-object v8, v4, v9

    .line 129
    invoke-virtual {v6, v7, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 132
    move-object v6, v3

    check-cast v6, Landroid/content/Context;

    sget v7, Lcom/stshell/app/R$mipmap;->ic_launcher:I

    invoke-static {v6, v7}, Landroid/graphics/drawable/Icon;->createWithResource(Landroid/content/Context;I)Landroid/graphics/drawable/Icon;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4, v2, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 128
    .end local v3    # "$this$buildProgressStyle_u24lambda_u247_u24lambda_u246\\2":Lcom/stshell/app/status/GenerationLiveUpdateService;
    .end local v5    # "$i$a$-runCatching-GenerationLiveUpdateService$buildProgressStyle$1$1\\2\\128\\1":I
    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v3

    :try_start_2
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v3}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    :goto_0
    nop

    .line 124
    .end local v0    # "$this$buildProgressStyle_u24lambda_u247\\1":Lcom/stshell/app/status/GenerationLiveUpdateService;
    .end local v1    # "$i$a$-runCatching-GenerationLiveUpdateService$buildProgressStyle$1\\1\\124\\0":I
    .end local v2    # "style\\1":Landroid/app/Notification$ProgressStyle;
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 135
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    .local v1, "it\\4":Ljava/lang/Throwable;
    const/4 v2, 0x0

    .line 136
    .local v2, "$i$a$-onFailure-GenerationLiveUpdateService$buildProgressStyle$2\\4\\135\\0":I
    const-string v3, "STPromoted"

    const-string v4, "ProgressStyle unavailable"

    invoke-static {v3, v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 137
    nop

    .line 135
    .end local v1    # "it\\4":Ljava/lang/Throwable;
    .end local v2    # "$i$a$-onFailure-GenerationLiveUpdateService$buildProgressStyle$2\\4\\135\\0":I
    nop

    .line 137
    :cond_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    :cond_1
    check-cast v0, Landroid/app/Notification$Style;

    .line 124
    return-object v0
.end method

.method private final createContentIntent()Landroid/app/PendingIntent;
    .locals 4

    .line 174
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/stshell/app/MainActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object v1, v0

    .local v1, "$this$createContentIntent_u24lambda_u2411\\1":Landroid/content/Intent;
    const/4 v2, 0x0

    .line 175
    .local v2, "$i$a$-apply-GenerationLiveUpdateService$createContentIntent$intent$1\\1\\174\\0":I
    const/high16 v3, 0x24000000

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 176
    nop

    .line 174
    .end local v1    # "$this$createContentIntent_u24lambda_u2411\\1":Landroid/content/Intent;
    .end local v2    # "$i$a$-apply-GenerationLiveUpdateService$createContentIntent$intent$1\\1\\174\\0":I
    nop

    .line 178
    .local v0, "intent":Landroid/content/Intent;
    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    .line 179
    nop

    .line 180
    nop

    .line 181
    nop

    .line 177
    const/16 v2, 0x3e9

    const/high16 v3, 0xc000000

    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    const-string v2, "getActivity(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method private final dismissPromotedLiveUpdate()V
    .locals 6

    .line 202
    invoke-direct {p0}, Lcom/stshell/app/status/GenerationLiveUpdateService;->buildDismissedNotification()Landroid/app/Notification;

    move-result-object v0

    .line 203
    .local v0, "dismissal":Landroid/app/Notification;
    invoke-direct {p0}, Lcom/stshell/app/status/GenerationLiveUpdateService;->notificationManager()Landroid/app/NotificationManager;

    move-result-object v1

    const/16 v2, 0xbb9

    invoke-virtual {v1, v2, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 205
    iget-object v1, p0, Lcom/stshell/app/status/GenerationLiveUpdateService;->mainHandler:Landroid/os/Handler;

    .line 206
    nop

    .line 205
    new-instance v2, Lcom/stshell/app/status/GenerationLiveUpdateService$$ExternalSyntheticLambda1;

    invoke-direct {v2, p0}, Lcom/stshell/app/status/GenerationLiveUpdateService$$ExternalSyntheticLambda1;-><init>(Lcom/stshell/app/status/GenerationLiveUpdateService;)V

    .line 211
    sget-object v3, Lcom/stshell/app/status/GenerationLiveUpdateService;->STOP_TOKEN:Ljava/lang/Object;

    .line 212
    nop

    .line 205
    const-wide/16 v4, 0x12c

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    .line 214
    return-void
.end method

.method private static final dismissPromotedLiveUpdate$lambda$13(Lcom/stshell/app/status/GenerationLiveUpdateService;)V
    .locals 2
    .param p0, "this$0"    # Lcom/stshell/app/status/GenerationLiveUpdateService;

    .line 207
    move-object v0, p0

    check-cast v0, Landroid/app/Service;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroidx/core/app/ServiceCompat;->stopForeground(Landroid/app/Service;I)V

    .line 208
    invoke-direct {p0}, Lcom/stshell/app/status/GenerationLiveUpdateService;->notificationManager()Landroid/app/NotificationManager;

    move-result-object v0

    const/16 v1, 0xbb9

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 209
    invoke-virtual {p0}, Lcom/stshell/app/status/GenerationLiveUpdateService;->stopSelf()V

    .line 210
    return-void
.end method

.method private final ensureChannels()V
    .locals 8

    .line 141
    nop

    .line 143
    new-instance v0, Landroid/app/NotificationChannel;

    .line 144
    nop

    .line 145
    const-string v1, "\u5b9e\u65f6\u6d3b\u52a8\uff08\u6d41\u4f53\u4e91\uff09"

    check-cast v1, Ljava/lang/CharSequence;

    .line 146
    nop

    .line 143
    const-string v2, "st_live_update_v2"

    const/4 v3, 0x4

    invoke-direct {v0, v2, v1, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 147
    move-object v1, v0

    .local v1, "$this$ensureChannels_u24lambda_u249\\1":Landroid/app/NotificationChannel;
    const/4 v2, 0x0

    .line 148
    .local v2, "$i$a$-apply-GenerationLiveUpdateService$ensureChannels$liveChannel$1\\1\\147\\0":I
    const-string v3, "SillyTavern \u751f\u6210\u4e2d\u7684\u5b9e\u65f6\u6d3b\u52a8\u901a\u77e5"

    invoke-virtual {v1, v3}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    .line 149
    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/app/NotificationChannel;->setShowBadge(Z)V

    .line 150
    invoke-virtual {v1, v3}, Landroid/app/NotificationChannel;->enableVibration(Z)V

    .line 151
    invoke-virtual {v1, v3}, Landroid/app/NotificationChannel;->enableLights(Z)V

    .line 152
    const/4 v4, 0x0

    invoke-virtual {v1, v4, v4}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    .line 153
    const/4 v5, 0x1

    invoke-virtual {v1, v5}, Landroid/app/NotificationChannel;->setLockscreenVisibility(I)V

    .line 154
    nop

    .line 147
    .end local v1    # "$this$ensureChannels_u24lambda_u249\\1":Landroid/app/NotificationChannel;
    .end local v2    # "$i$a$-apply-GenerationLiveUpdateService$ensureChannels$liveChannel$1\\1\\147\\0":I
    nop

    .line 143
    nop

    .line 156
    .local v0, "liveChannel":Landroid/app/NotificationChannel;
    new-instance v1, Landroid/app/NotificationChannel;

    .line 157
    nop

    .line 158
    const-string v2, "SillyTavern \u72b6\u6001"

    check-cast v2, Ljava/lang/CharSequence;

    .line 159
    nop

    .line 156
    const-string v6, "st_generation_status"

    const/4 v7, 0x3

    invoke-direct {v1, v6, v2, v7}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 160
    move-object v2, v1

    .local v2, "$this$ensureChannels_u24lambda_u2410\\2":Landroid/app/NotificationChannel;
    const/4 v6, 0x0

    .line 161
    .local v6, "$i$a$-apply-GenerationLiveUpdateService$ensureChannels$fallbackChannel$1\\2\\160\\0":I
    const-string v7, "SillyTavern \u666e\u901a\u72b6\u6001\u901a\u77e5"

    invoke-virtual {v2, v7}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    .line 162
    invoke-virtual {v2, v3}, Landroid/app/NotificationChannel;->setShowBadge(Z)V

    .line 163
    invoke-virtual {v2, v3}, Landroid/app/NotificationChannel;->enableVibration(Z)V

    .line 164
    invoke-virtual {v2, v3}, Landroid/app/NotificationChannel;->enableLights(Z)V

    .line 165
    invoke-virtual {v2, v4, v4}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    .line 166
    invoke-virtual {v2, v5}, Landroid/app/NotificationChannel;->setLockscreenVisibility(I)V

    .line 167
    nop

    .line 160
    .end local v2    # "$this$ensureChannels_u24lambda_u2410\\2":Landroid/app/NotificationChannel;
    .end local v6    # "$i$a$-apply-GenerationLiveUpdateService$ensureChannels$fallbackChannel$1\\2\\160\\0":I
    nop

    .line 156
    nop

    .line 169
    .local v1, "fallbackChannel":Landroid/app/NotificationChannel;
    invoke-direct {p0}, Lcom/stshell/app/status/GenerationLiveUpdateService;->notificationManager()Landroid/app/NotificationManager;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 170
    invoke-direct {p0}, Lcom/stshell/app/status/GenerationLiveUpdateService;->notificationManager()Landroid/app/NotificationManager;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 171
    return-void
.end method

.method private final invokeBooleanMethod(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 6
    .param p1, "target"    # Ljava/lang/Object;
    .param p2, "methodName"    # Ljava/lang/String;
    .param p3, "value"    # Z

    .line 249
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/stshell/app/status/GenerationLiveUpdateService;

    .local v0, "$this$invokeBooleanMethod_u24lambda_u2416\\1":Lcom/stshell/app/status/GenerationLiveUpdateService;
    const/4 v1, 0x0

    .line 250
    .local v1, "$i$a$-runCatching-GenerationLiveUpdateService$invokeBooleanMethod$1\\1\\249\\0":I
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v2, p2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, p1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 249
    .end local v0    # "$this$invokeBooleanMethod_u24lambda_u2416\\1":Lcom/stshell/app/status/GenerationLiveUpdateService;
    .end local v1    # "$i$a$-runCatching-GenerationLiveUpdateService$invokeBooleanMethod$1\\1\\249\\0":I
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    :goto_0
    return-void
.end method

.method private final invokeCharSequenceMethod(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/CharSequence;)V
    .locals 6
    .param p1, "target"    # Ljava/lang/Object;
    .param p2, "methodName"    # Ljava/lang/String;
    .param p3, "value"    # Ljava/lang/CharSequence;

    .line 261
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/stshell/app/status/GenerationLiveUpdateService;

    .local v0, "$this$invokeCharSequenceMethod_u24lambda_u2418\\1":Lcom/stshell/app/status/GenerationLiveUpdateService;
    const/4 v1, 0x0

    .line 262
    .local v1, "$i$a$-runCatching-GenerationLiveUpdateService$invokeCharSequenceMethod$1\\1\\261\\0":I
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    const-class v4, Ljava/lang/CharSequence;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v2, p2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, p1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 261
    .end local v0    # "$this$invokeCharSequenceMethod_u24lambda_u2418\\1":Lcom/stshell/app/status/GenerationLiveUpdateService;
    .end local v1    # "$i$a$-runCatching-GenerationLiveUpdateService$invokeCharSequenceMethod$1\\1\\261\\0":I
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    :goto_0
    return-void
.end method

.method private final invokeIntMethod(Ljava/lang/Object;Ljava/lang/String;I)V
    .locals 6
    .param p1, "target"    # Ljava/lang/Object;
    .param p2, "methodName"    # Ljava/lang/String;
    .param p3, "value"    # I

    .line 255
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/stshell/app/status/GenerationLiveUpdateService;

    .local v0, "$this$invokeIntMethod_u24lambda_u2417\\1":Lcom/stshell/app/status/GenerationLiveUpdateService;
    const/4 v1, 0x0

    .line 256
    .local v1, "$i$a$-runCatching-GenerationLiveUpdateService$invokeIntMethod$1\\1\\255\\0":I
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v2, p2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, p1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 255
    .end local v0    # "$this$invokeIntMethod_u24lambda_u2417\\1":Lcom/stshell/app/status/GenerationLiveUpdateService;
    .end local v1    # "$i$a$-runCatching-GenerationLiveUpdateService$invokeIntMethod$1\\1\\255\\0":I
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    :goto_0
    return-void
.end method

.method private final logPromotionState(Landroid/app/Notification;Z)V
    .locals 9
    .param p1, "notification"    # Landroid/app/Notification;
    .param p2, "requestPromoted"    # Z

    .line 236
    const-string v0, "null cannot be cast to non-null type kotlin.Boolean"

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x24

    if-ge v1, v2, :cond_0

    return-void

    .line 237
    :cond_0
    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v2, p0

    check-cast v2, Lcom/stshell/app/status/GenerationLiveUpdateService;

    .local v2, "$this$logPromotionState_u24lambda_u2414\\1":Lcom/stshell/app/status/GenerationLiveUpdateService;
    const/4 v3, 0x0

    .line 238
    .local v3, "$i$a$-runCatching-GenerationLiveUpdateService$logPromotionState$canPost$1\\1\\237\\0":I
    const-class v4, Landroid/app/NotificationManager;

    const-string v5, "canPostPromotedNotifications"

    new-array v6, v1, [Ljava/lang/Class;

    invoke-virtual {v4, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 239
    invoke-direct {v2}, Lcom/stshell/app/status/GenerationLiveUpdateService;->notificationManager()Landroid/app/NotificationManager;

    move-result-object v5

    new-array v6, v1, [Ljava/lang/Object;

    invoke-virtual {v4, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 238
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    .line 239
    nop

    .end local v2    # "$this$logPromotionState_u24lambda_u2414\\1":Lcom/stshell/app/status/GenerationLiveUpdateService;
    .end local v3    # "$i$a$-runCatching-GenerationLiveUpdateService$logPromotionState$canPost$1\\1\\237\\0":I
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .line 237
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 240
    :goto_0
    invoke-static {v2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    move-object v2, v4

    :cond_1
    check-cast v2, Ljava/lang/Boolean;

    .line 237
    nop

    .line 241
    .local v2, "canPost":Ljava/lang/Boolean;
    :try_start_1
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v3, p0

    check-cast v3, Lcom/stshell/app/status/GenerationLiveUpdateService;

    .local v3, "$this$logPromotionState_u24lambda_u2415\\2":Lcom/stshell/app/status/GenerationLiveUpdateService;
    const/4 v5, 0x0

    .line 242
    .local v5, "$i$a$-runCatching-GenerationLiveUpdateService$logPromotionState$promotable$1\\2\\241\\0":I
    const-class v6, Landroid/app/Notification;

    const-string v7, "hasPromotableCharacteristics"

    new-array v8, v1, [Ljava/lang/Class;

    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 243
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 242
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 243
    nop

    .end local v3    # "$this$logPromotionState_u24lambda_u2415\\2":Lcom/stshell/app/status/GenerationLiveUpdateService;
    .end local v5    # "$i$a$-runCatching-GenerationLiveUpdateService$logPromotionState$promotable$1\\2\\241\\0":I
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 241
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 244
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    move-object v4, v0

    :goto_2
    check-cast v4, Ljava/lang/Boolean;

    .line 241
    nop

    .line 245
    .local v4, "promotable":Ljava/lang/Boolean;
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "service requestPromoted="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " canPost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " promotable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "STPromoted"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 246
    return-void
.end method

.method private final notificationManager()Landroid/app/NotificationManager;
    .locals 2

    .line 217
    const-class v0, Landroid/app/NotificationManager;

    invoke-virtual {p0, v0}, Lcom/stshell/app/status/GenerationLiveUpdateService;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getSystemService(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/NotificationManager;

    return-object v0
.end method

.method private final scheduleStop(JZ)V
    .locals 3
    .param p1, "delayMs"    # J
    .param p3, "removeForeground"    # Z

    .line 186
    iget-object v0, p0, Lcom/stshell/app/status/GenerationLiveUpdateService;->mainHandler:Landroid/os/Handler;

    sget-object v1, Lcom/stshell/app/status/GenerationLiveUpdateService;->STOP_TOKEN:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 187
    iget-object v0, p0, Lcom/stshell/app/status/GenerationLiveUpdateService;->mainHandler:Landroid/os/Handler;

    .line 188
    nop

    .line 187
    new-instance v1, Lcom/stshell/app/status/GenerationLiveUpdateService$$ExternalSyntheticLambda0;

    invoke-direct {v1, p3, p0}, Lcom/stshell/app/status/GenerationLiveUpdateService$$ExternalSyntheticLambda0;-><init>(ZLcom/stshell/app/status/GenerationLiveUpdateService;)V

    .line 196
    sget-object v2, Lcom/stshell/app/status/GenerationLiveUpdateService;->STOP_TOKEN:Ljava/lang/Object;

    .line 197
    nop

    .line 187
    invoke-virtual {v0, v1, v2, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    .line 199
    return-void
.end method

.method static synthetic scheduleStop$default(Lcom/stshell/app/status/GenerationLiveUpdateService;JZILjava/lang/Object;)V
    .locals 0

    .line 185
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/stshell/app/status/GenerationLiveUpdateService;->scheduleStop(JZ)V

    return-void
.end method

.method private static final scheduleStop$lambda$12(ZLcom/stshell/app/status/GenerationLiveUpdateService;)V
    .locals 2
    .param p0, "$removeForeground"    # Z
    .param p1, "this$0"    # Lcom/stshell/app/status/GenerationLiveUpdateService;

    .line 189
    if-eqz p0, :cond_0

    .line 190
    invoke-direct {p1}, Lcom/stshell/app/status/GenerationLiveUpdateService;->dismissPromotedLiveUpdate()V

    goto :goto_0

    .line 192
    :cond_0
    invoke-direct {p1}, Lcom/stshell/app/status/GenerationLiveUpdateService;->notificationManager()Landroid/app/NotificationManager;

    move-result-object v0

    const/16 v1, 0xbb9

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 193
    invoke-virtual {p1}, Lcom/stshell/app/status/GenerationLiveUpdateService;->stopSelf()V

    .line 195
    :goto_0
    return-void
.end method

.method private final startLiveForeground(Landroid/app/Notification;)V
    .locals 3
    .param p1, "notification"    # Landroid/app/Notification;

    .line 221
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    .line 222
    const/4 v0, 0x1

    goto :goto_0

    .line 224
    :cond_0
    const/4 v0, 0x0

    .line 221
    :goto_0
    nop

    .line 228
    .local v0, "foregroundType":I
    move-object v1, p0

    check-cast v1, Landroid/app/Service;

    .line 229
    nop

    .line 230
    nop

    .line 231
    nop

    .line 227
    const/16 v2, 0xbb9

    invoke-static {v1, v2, p1, v0}, Landroidx/core/app/ServiceCompat;->startForeground(Landroid/app/Service;ILandroid/app/Notification;I)V

    .line 233
    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1
    .param p1, "intent"    # Landroid/content/Intent;

    .line 31
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 0

    .line 27
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 28
    invoke-direct {p0}, Lcom/stshell/app/status/GenerationLiveUpdateService;->ensureChannels()V

    .line 29
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 11
    .param p1, "intent"    # Landroid/content/Intent;
    .param p2, "flags"    # I
    .param p3, "startId"    # I

    .line 34
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x0

    const-string v3, ""

    const-string v4, "extra_text"

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_6

    :sswitch_0
    const-string v1, "com.stshell.app.action.LIVE_HEARTBEAT"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_3

    .line 42
    :cond_1
    iget-object v0, p0, Lcom/stshell/app/status/GenerationLiveUpdateService;->mainHandler:Landroid/os/Handler;

    sget-object v1, Lcom/stshell/app/status/GenerationLiveUpdateService;->STOP_TOKEN:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 43
    invoke-virtual {p1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    move-object v3, v0

    :goto_1
    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 330
    const/4 v0, 0x0

    .line 43
    .local v0, "$i$a$-ifBlank-GenerationLiveUpdateService$onStartCommand$text$2\\2\\43\\0":I
    nop

    .end local v0    # "$i$a$-ifBlank-GenerationLiveUpdateService$onStartCommand$text$2\\2\\43\\0":I
    const-string v3, "\u6b63\u5728\u8f93\u51fa\u5185\u5bb9"

    :cond_3
    move-object v0, v3

    check-cast v0, Ljava/lang/String;

    .line 44
    .local v0, "text":Ljava/lang/String;
    const/16 v1, 0x4b

    invoke-direct {p0, v0, v1, v2}, Lcom/stshell/app/status/GenerationLiveUpdateService;->buildLiveNotification(Ljava/lang/String;IZ)Landroid/app/Notification;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/stshell/app/status/GenerationLiveUpdateService;->startLiveForeground(Landroid/app/Notification;)V

    move-object v5, p0

    .end local v0    # "text":Ljava/lang/String;
    goto/16 :goto_7

    .line 34
    :sswitch_1
    const-string v1, "com.stshell.app.action.LIVE_COMPLETE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_3

    .line 48
    :cond_4
    invoke-virtual {p1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    move-object v3, v0

    :goto_2
    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 330
    const/4 v0, 0x0

    .line 48
    .local v0, "$i$a$-ifBlank-GenerationLiveUpdateService$onStartCommand$text$3\\3\\48\\0":I
    nop

    .end local v0    # "$i$a$-ifBlank-GenerationLiveUpdateService$onStartCommand$text$3\\3\\48\\0":I
    const-string v3, "AI \u56de\u590d\u5df2\u751f\u6210\u5b8c\u6210"

    :cond_6
    move-object v0, v3

    check-cast v0, Ljava/lang/String;

    .line 49
    .local v0, "text":Ljava/lang/String;
    const/16 v1, 0x64

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/stshell/app/status/GenerationLiveUpdateService;->buildLiveNotification(Ljava/lang/String;IZ)Landroid/app/Notification;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/stshell/app/status/GenerationLiveUpdateService;->startLiveForeground(Landroid/app/Notification;)V

    .line 50
    const-wide/16 v3, 0x2710

    invoke-direct {p0, v3, v4, v2}, Lcom/stshell/app/status/GenerationLiveUpdateService;->scheduleStop(JZ)V

    move-object v5, p0

    .end local v0    # "text":Ljava/lang/String;
    goto/16 :goto_7

    .line 34
    :sswitch_2
    const-string v1, "com.stshell.app.action.LIVE_STOP"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    :goto_3
    move-object v5, p0

    goto/16 :goto_7

    .line 54
    :cond_7
    invoke-virtual {p1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_8

    goto :goto_4

    :cond_8
    move-object v3, v0

    :goto_4
    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 330
    const/4 v0, 0x0

    .line 54
    .local v0, "$i$a$-ifBlank-GenerationLiveUpdateService$onStartCommand$text$4\\4\\54\\0":I
    nop

    .end local v0    # "$i$a$-ifBlank-GenerationLiveUpdateService$onStartCommand$text$4\\4\\54\\0":I
    const-string v3, "\u5f53\u524d\u751f\u6210\u5df2\u4e2d\u65ad"

    :cond_9
    move-object v0, v3

    check-cast v0, Ljava/lang/String;

    .line 55
    .local v0, "text":Ljava/lang/String;
    invoke-direct {p0}, Lcom/stshell/app/status/GenerationLiveUpdateService;->notificationManager()Landroid/app/NotificationManager;

    move-result-object v1

    .line 56
    nop

    .line 57
    const-string v3, "SillyTavern \u5df2\u505c\u6b62"

    invoke-direct {p0, v3, v0}, Lcom/stshell/app/status/GenerationLiveUpdateService;->buildFallbackNotification(Ljava/lang/String;Ljava/lang/String;)Landroid/app/Notification;

    move-result-object v3

    .line 55
    const/16 v4, 0xbb9

    invoke-virtual {v1, v4, v3}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 59
    invoke-virtual {p0, v2}, Lcom/stshell/app/status/GenerationLiveUpdateService;->stopForeground(Z)V

    .line 60
    const/4 v9, 0x2

    const/4 v10, 0x0

    const-wide/16 v6, 0x1f40

    const/4 v8, 0x0

    move-object v5, p0

    invoke-static/range {v5 .. v10}, Lcom/stshell/app/status/GenerationLiveUpdateService;->scheduleStop$default(Lcom/stshell/app/status/GenerationLiveUpdateService;JZILjava/lang/Object;)V

    goto :goto_7

    .line 34
    .end local v0    # "text":Ljava/lang/String;
    :sswitch_3
    move-object v5, p0

    const-string v1, "com.stshell.app.action.LIVE_START"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_7

    .line 36
    :cond_a
    iget-object v0, v5, Lcom/stshell/app/status/GenerationLiveUpdateService;->mainHandler:Landroid/os/Handler;

    sget-object v1, Lcom/stshell/app/status/GenerationLiveUpdateService;->STOP_TOKEN:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 37
    invoke-virtual {p1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_b

    goto :goto_5

    :cond_b
    move-object v3, v0

    :goto_5
    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 330
    const/4 v0, 0x0

    .line 37
    .local v0, "$i$a$-ifBlank-GenerationLiveUpdateService$onStartCommand$text$1\\1\\37\\0":I
    nop

    .end local v0    # "$i$a$-ifBlank-GenerationLiveUpdateService$onStartCommand$text$1\\1\\37\\0":I
    const-string v3, "AI \u56de\u590d\u751f\u6210\u4e2d"

    :cond_c
    move-object v0, v3

    check-cast v0, Ljava/lang/String;

    .line 38
    .local v0, "text":Ljava/lang/String;
    const/16 v1, 0x3c

    invoke-direct {p0, v0, v1, v2}, Lcom/stshell/app/status/GenerationLiveUpdateService;->buildLiveNotification(Ljava/lang/String;IZ)Landroid/app/Notification;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/stshell/app/status/GenerationLiveUpdateService;->startLiveForeground(Landroid/app/Notification;)V

    .end local v0    # "text":Ljava/lang/String;
    goto :goto_7

    .line 34
    :cond_d
    :goto_6
    move-object v5, p0

    .line 64
    :goto_7
    const/4 v0, 0x2

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7dc3f092 -> :sswitch_3
        -0x672758aa -> :sswitch_2
        0x1910fe8d -> :sswitch_1
        0x68a74e08 -> :sswitch_0
    .end sparse-switch
.end method
