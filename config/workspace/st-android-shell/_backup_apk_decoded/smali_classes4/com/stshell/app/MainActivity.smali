.class public final Lcom/stshell/app/MainActivity;
.super Landroidx/activity/ComponentActivity;
.source "MainActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0014J\u001a\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00082\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0008H\u0002J\u0008\u0010\u0010\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stshell/app/MainActivity;",
        "Landroidx/activity/ComponentActivity;",
        "<init>",
        "()V",
        "generationStatusController",
        "Lcom/stshell/app/status/GenerationStatusController;",
        "notificationPermissionLauncher",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "handleNativeEvent",
        "name",
        "payloadJson",
        "ensureNotificationPermission",
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
.field private generationStatusController:Lcom/stshell/app/status/GenerationStatusController;

.field private final notificationPermissionLauncher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$GttmreRiS1RT9WYPqsnr_fhtW2w(Lcom/stshell/app/MainActivity;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stshell/app/MainActivity;->notificationPermissionLauncher$lambda$0(Lcom/stshell/app/MainActivity;Z)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/stshell/app/MainActivity;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 73
    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    .line 76
    nop

    .line 77
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    check-cast v0, Landroidx/activity/result/contract/ActivityResultContract;

    .line 78
    nop

    .line 76
    new-instance v1, Lcom/stshell/app/MainActivity$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lcom/stshell/app/MainActivity$$ExternalSyntheticLambda0;-><init>(Lcom/stshell/app/MainActivity;)V

    invoke-virtual {p0, v0, v1}, Lcom/stshell/app/MainActivity;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v0

    iput-object v0, p0, Lcom/stshell/app/MainActivity;->notificationPermissionLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 73
    return-void
.end method

.method public static final synthetic access$handleNativeEvent(Lcom/stshell/app/MainActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p0, "$this"    # Lcom/stshell/app/MainActivity;
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "payloadJson"    # Ljava/lang/String;

    .line 73
    invoke-direct {p0, p1, p2}, Lcom/stshell/app/MainActivity;->handleNativeEvent(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final ensureNotificationPermission()V
    .locals 2

    .line 133
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-ge v0, v1, :cond_0

    return-void

    .line 134
    :cond_0
    nop

    .line 135
    nop

    .line 136
    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    .line 137
    nop

    .line 135
    const-string v1, "android.permission.POST_NOTIFICATIONS"

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    .line 140
    return-void

    .line 143
    :cond_1
    iget-object v0, p0, Lcom/stshell/app/MainActivity;->notificationPermissionLauncher:Landroidx/activity/result/ActivityResultLauncher;

    invoke-virtual {v0, v1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 144
    return-void
.end method

.method private final handleNativeEvent(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "payloadJson"    # Ljava/lang/String;

    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Bridge event: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " payload="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "STShell"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 122
    nop

    .line 123
    const/4 v0, 0x0

    :try_start_0
    sget-object v2, Lcom/stshell/app/status/GenerationStatusEvent;->Companion:Lcom/stshell/app/status/GenerationStatusEvent$Companion;

    invoke-virtual {v2, p1, p2}, Lcom/stshell/app/status/GenerationStatusEvent$Companion;->from(Ljava/lang/String;Ljava/lang/String;)Lcom/stshell/app/status/GenerationStatusEvent;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 124
    :catchall_0
    move-exception v2

    .line 125
    .local v2, "error":Ljava/lang/Throwable;
    const-string v3, "Failed to parse bridge event"

    invoke-static {v1, v3, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 126
    move-object v1, v0

    .line 122
    .end local v2    # "error":Ljava/lang/Throwable;
    :goto_0
    if-nez v1, :cond_0

    .line 127
    return-void

    .line 129
    .local v1, "event":Lcom/stshell/app/status/GenerationStatusEvent;
    :cond_0
    iget-object v2, p0, Lcom/stshell/app/MainActivity;->generationStatusController:Lcom/stshell/app/status/GenerationStatusController;

    if-nez v2, :cond_1

    const-string v2, "generationStatusController"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object v0, v2

    :goto_1
    invoke-virtual {v0, v1}, Lcom/stshell/app/status/GenerationStatusController;->handle(Lcom/stshell/app/status/GenerationStatusEvent;)V

    .line 130
    return-void
.end method

.method private static final notificationPermissionLauncher$lambda$0(Lcom/stshell/app/MainActivity;Z)V
    .locals 3
    .param p0, "this$0"    # Lcom/stshell/app/MainActivity;
    .param p1, "granted"    # Z

    .line 79
    if-nez p1, :cond_0

    .line 80
    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    const-string v1, "\u901a\u77e5\u6743\u9650\u672a\u5f00\u542f\uff0c\u6d41\u4f53\u4e91/\u72b6\u6001\u901a\u77e5\u53ef\u80fd\u65e0\u6cd5\u663e\u793a"

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 82
    :cond_0
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 85
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 87
    sget-boolean v0, Lcom/stshell/app/BuildConfig;->DEBUG:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 88
    invoke-static {v1}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 91
    :cond_0
    new-instance v0, Lcom/stshell/app/status/GenerationStatusController;

    .line 92
    new-instance v2, Lcom/stshell/app/status/CompositeStatusPresenter;

    .line 94
    const/4 v3, 0x2

    new-array v3, v3, [Lcom/stshell/app/status/StatusPresenter;

    new-instance v4, Lcom/stshell/app/status/NotificationStatusPresenter;

    move-object v5, p0

    check-cast v5, Landroid/content/Context;

    invoke-direct {v4, v5}, Lcom/stshell/app/status/NotificationStatusPresenter;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 95
    new-instance v4, Lcom/stshell/app/status/FluidCloudStatusPresenter;

    invoke-direct {v4}, Lcom/stshell/app/status/FluidCloudStatusPresenter;-><init>()V

    aput-object v4, v3, v1

    .line 94
    nop

    .line 93
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 92
    invoke-direct {v2, v3}, Lcom/stshell/app/status/CompositeStatusPresenter;-><init>(Ljava/util/List;)V

    check-cast v2, Lcom/stshell/app/status/StatusPresenter;

    .line 91
    invoke-direct {v0, v2}, Lcom/stshell/app/status/GenerationStatusController;-><init>(Lcom/stshell/app/status/StatusPresenter;)V

    iput-object v0, p0, Lcom/stshell/app/MainActivity;->generationStatusController:Lcom/stshell/app/status/GenerationStatusController;

    .line 100
    invoke-direct {p0}, Lcom/stshell/app/MainActivity;->ensureNotificationPermission()V

    .line 102
    move-object v0, p0

    check-cast v0, Landroidx/activity/ComponentActivity;

    new-instance v2, Lcom/stshell/app/MainActivity$onCreate$1;

    invoke-direct {v2, p0}, Lcom/stshell/app/MainActivity$onCreate$1;-><init>(Lcom/stshell/app/MainActivity;)V

    const v3, -0x24b69abd

    invoke-static {v3, v1, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    check-cast v2, Lkotlin/jvm/functions/Function2;

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v1, v3}, Landroidx/activity/compose/ComponentActivityKt;->setContent$default(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 118
    return-void
.end method
