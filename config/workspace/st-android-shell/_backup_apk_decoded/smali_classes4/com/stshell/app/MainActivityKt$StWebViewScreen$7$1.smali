.class final Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;
.super Ljava/lang/Object;
.source "MainActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stshell/app/MainActivityKt;->StWebViewScreen(Ljava/lang/String;Lcom/stshell/app/HttpAuthCredentialsStore;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/stshell/app/MainActivityKt$StWebViewScreen$7$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,840:1\n149#2:841\n149#2:877\n149#2:878\n149#2:880\n149#2:887\n149#2:894\n86#3:842\n84#3,5:843\n89#3:876\n93#3:904\n79#4,6:848\n86#4,4:863\n90#4,2:873\n94#4:903\n368#5,9:854\n377#5:875\n378#5,2:901\n4034#6,6:867\n1#7:879\n1225#8,6:881\n1225#8,6:888\n1225#8,6:895\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/stshell/app/MainActivityKt$StWebViewScreen$7$1\n*L\n494#1:841\n498#1:877\n500#1:878\n502#1:880\n513#1:887\n526#1:894\n491#1:842\n491#1:843,5\n491#1:876\n491#1:904\n491#1:848,6\n491#1:863,4\n491#1:873,2\n491#1:903\n491#1:854,9\n491#1:875\n491#1:901,2\n491#1:867,6\n504#1:881,6\n515#1:888,6\n528#1:895,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $authPassword$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $authUsername$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $credentialsStore:Lcom/stshell/app/HttpAuthCredentialsStore;

.field final synthetic $initialHost:Ljava/lang/String;

.field final synthetic $message:Ljava/lang/String;

.field final synthetic $pageState$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stshell/app/PageState;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $startupAuthRequest$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stshell/app/PreemptiveAuthRequestState;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $url:Ljava/lang/String;

.field final synthetic $webView$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroid/webkit/WebView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$54WJLpcOc7SyRj_DBlV9McoAlYQ(Landroid/content/Context;Landroidx/compose/runtime/MutableState;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;->invoke$lambda$8$lambda$7$lambda$6(Landroid/content/Context;Landroidx/compose/runtime/MutableState;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$XtiGx8eknqGDa5ik3G_vig8p7hA(Lcom/stshell/app/HttpAuthCredentialsStore;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;->invoke$lambda$8$lambda$4$lambda$3(Lcom/stshell/app/HttpAuthCredentialsStore;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$obawQ0bt5NvH-RYOvMUZ_NZ3bX4(Lcom/stshell/app/HttpAuthCredentialsStore;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;->invoke$lambda$8$lambda$2$lambda$1(Lcom/stshell/app/HttpAuthCredentialsStore;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Ljava/lang/String;Lcom/stshell/app/HttpAuthCredentialsStore;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stshell/app/HttpAuthCredentialsStore;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/Context;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stshell/app/PageState;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Landroid/webkit/WebView;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stshell/app/PreemptiveAuthRequestState;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;->$message:Ljava/lang/String;

    iput-object p2, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;->$credentialsStore:Lcom/stshell/app/HttpAuthCredentialsStore;

    iput-object p3, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;->$initialHost:Ljava/lang/String;

    iput-object p4, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;->$url:Ljava/lang/String;

    iput-object p5, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;->$authUsername$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;->$authPassword$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;->$context:Landroid/content/Context;

    iput-object p8, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p9, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;->$webView$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p10, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;->$startupAuthRequest$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$8$lambda$2$lambda$1(Lcom/stshell/app/HttpAuthCredentialsStore;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 7
    .param p0, "$credentialsStore"    # Lcom/stshell/app/HttpAuthCredentialsStore;
    .param p1, "$initialHost"    # Ljava/lang/String;
    .param p2, "$url"    # Ljava/lang/String;
    .param p3, "$pageState$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p4, "$webView$delegate"    # Landroidx/compose/runtime/MutableState;

    .line 505
    invoke-static {p3}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$26(Landroidx/compose/runtime/MutableState;)Lcom/stshell/app/PageState;

    move-result-object v0

    const/16 v5, 0xa

    const/4 v6, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/stshell/app/PageState;->copy$default(Lcom/stshell/app/PageState;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lcom/stshell/app/PageState;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$27(Landroidx/compose/runtime/MutableState;Lcom/stshell/app/PageState;)V

    .line 506
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/stshell/app/HttpAuthCredentialsStore;->get(Ljava/lang/String;Ljava/lang/String;)Lcom/stshell/app/HttpAuthCredentials;

    move-result-object v0

    .line 507
    .local v0, "credentials":Lcom/stshell/app/HttpAuthCredentials;
    invoke-static {p4}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$2(Landroidx/compose/runtime/MutableState;)Landroid/webkit/WebView;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1, p2, v0}, Lcom/stshell/app/MainActivityKt;->access$loadUrlWithHttpAuth(Landroid/webkit/WebView;Ljava/lang/String;Lcom/stshell/app/HttpAuthCredentials;)V

    .line 508
    :cond_0
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method private static final invoke$lambda$8$lambda$4$lambda$3(Lcom/stshell/app/HttpAuthCredentialsStore;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 8
    .param p0, "$credentialsStore"    # Lcom/stshell/app/HttpAuthCredentialsStore;
    .param p1, "$initialHost"    # Ljava/lang/String;
    .param p2, "$url"    # Ljava/lang/String;
    .param p3, "$authUsername$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p4, "$authPassword$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p5, "$pageState$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p6, "$startupAuthRequest$delegate"    # Landroidx/compose/runtime/MutableState;

    .line 516
    invoke-virtual {p0, p1}, Lcom/stshell/app/HttpAuthCredentialsStore;->clearHost(Ljava/lang/String;)V

    .line 517
    const-string v0, ""

    invoke-static {p3, v0}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$16(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 518
    invoke-static {p4, v0}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$20(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 519
    invoke-static {p5}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$26(Landroidx/compose/runtime/MutableState;)Lcom/stshell/app/PageState;

    move-result-object v1

    const/16 v6, 0xa

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/stshell/app/PageState;->copy$default(Lcom/stshell/app/PageState;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lcom/stshell/app/PageState;

    move-result-object v0

    invoke-static {p5, v0}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$27(Landroidx/compose/runtime/MutableState;Lcom/stshell/app/PageState;)V

    .line 520
    new-instance v0, Lcom/stshell/app/PreemptiveAuthRequestState;

    invoke-direct {v0, p1, p2}, Lcom/stshell/app/PreemptiveAuthRequestState;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p6, v0}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$9(Landroidx/compose/runtime/MutableState;Lcom/stshell/app/PreemptiveAuthRequestState;)V

    .line 521
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final invoke$lambda$8$lambda$7$lambda$6(Landroid/content/Context;Landroidx/compose/runtime/MutableState;Ljava/lang/String;)Lkotlin/Unit;
    .locals 4
    .param p0, "$context"    # Landroid/content/Context;
    .param p1, "$pageState$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p2, "$url"    # Ljava/lang/String;

    .line 529
    invoke-static {p1}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$26(Landroidx/compose/runtime/MutableState;)Lcom/stshell/app/PageState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stshell/app/PageState;->getLastUrl()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 879
    const/4 v0, 0x0

    .line 529
    .local v0, "$i$a$-ifBlank-MainActivityKt$StWebViewScreen$7$1$1$4$1$target$1\\1\\529\\0":I
    move-object v0, p2

    .end local v0    # "$i$a$-ifBlank-MainActivityKt$StWebViewScreen$7$1$1$4$1$target$1\\1\\529\\0":I
    :cond_0
    check-cast v0, Ljava/lang/String;

    .line 530
    .local v0, "target":Ljava/lang/String;
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 531
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1, "p1"    # Ljava/lang/Object;
    .param p2, "p2"    # Ljava/lang/Object;

    .line 490
    move-object v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 80
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    const-string v3, "C490@19302L2109:MainActivity.kt#r5p2a3"

    invoke-static {v1, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 491
    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 536
    :cond_0
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_a

    .line 491
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "com.stshell.app.StWebViewScreen.<anonymous>.<anonymous> (MainActivity.kt:490)"

    const v5, 0x237f68ae

    invoke-static {v5, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 492
    :cond_2
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    .line 493
    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 494
    const/16 v7, 0x18

    .local v7, "$this$dp\\1":I
    const/4 v8, 0x0

    .line 841
    .local v8, "$i$f$getDp\\1\\494":I
    int-to-float v9, v7

    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v7

    .line 494
    .end local v7    # "$this$dp\\1":I
    .end local v8    # "$i$f$getDp\\1\\494":I
    invoke-static {v3, v7}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 495
    sget-object v7, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v7}, Landroidx/compose/foundation/layout/Arrangement;->getCenter()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    move-result-object v7

    check-cast v7, Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 491
    iget-object v8, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;->$message:Ljava/lang/String;

    iget-object v9, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;->$credentialsStore:Lcom/stshell/app/HttpAuthCredentialsStore;

    iget-object v10, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;->$initialHost:Ljava/lang/String;

    iget-object v11, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;->$url:Ljava/lang/String;

    iget-object v12, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;->$authUsername$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v13, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;->$authPassword$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v14, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;->$context:Landroid/content/Context;

    iget-object v15, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;->$webView$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1;->$startupAuthRequest$delegate:Landroidx/compose/runtime/MutableState;

    const/16 v16, 0x36

    .local v3, "modifier\\2":Landroidx/compose/ui/Modifier;
    .local v7, "verticalArrangement\\2":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v16, "$changed\\2":I
    move/from16 v33, v16

    .end local v16    # "$changed\\2":I
    .local v33, "$changed\\2":I
    const/16 v34, 0x0

    .line 842
    .local v34, "$i$f$Column\\2\\491":I
    const v6, -0x1cd0f17e

    const-string v0, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo"

    invoke-static {v1, v6, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 843
    sget-object v0, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v0

    .line 846
    .local v0, "horizontalAlignment\\2":Landroidx/compose/ui/Alignment$Horizontal;
    shr-int/lit8 v6, v33, 0x3

    and-int/lit8 v6, v6, 0xe

    shr-int/lit8 v16, v33, 0x3

    and-int/lit8 v16, v16, 0x70

    or-int v6, v6, v16

    invoke-static {v7, v0, v1, v6}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v6

    .local v6, "measurePolicy\\2":Landroidx/compose/ui/layout/MeasurePolicy;
    shl-int/lit8 v16, v33, 0x3

    and-int/lit8 v16, v16, 0x70

    .line 847
    move/from16 v35, v16

    .local v35, "$changed\\3":I
    const/16 v36, 0x0

    .line 848
    .local v36, "$i$f$Layout\\3\\847":I
    move-object/from16 v37, v0

    .end local v0    # "horizontalAlignment\\2":Landroidx/compose/ui/Alignment$Horizontal;
    .local v37, "horizontalAlignment\\2":Landroidx/compose/ui/Alignment$Horizontal;
    const v0, -0x4ee9b9da

    const-string v2, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    invoke-static {v1, v0, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 849
    const/4 v0, 0x0

    invoke-static {v1, v0}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v0

    .line 850
    .local v0, "compositeKeyHash\\3":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v2

    .line 851
    .local v2, "localMap\\3":Landroidx/compose/runtime/CompositionLocalMap;
    move-object/from16 v16, v9

    invoke-static {v1, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    .line 853
    .local v9, "materialized\\3":Landroidx/compose/ui/Modifier;
    sget-object v17, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v17

    move/from16 v38, v0

    .end local v0    # "compositeKeyHash\\3":I
    .local v38, "compositeKeyHash\\3":I
    shl-int/lit8 v0, v35, 0x6

    and-int/lit16 v0, v0, 0x380

    move-object/from16 v18, v10

    const/4 v10, 0x6

    or-int/2addr v0, v10

    .line 852
    nop

    .local v0, "$changed\\4":I
    move-object/from16 v39, v17

    .local v39, "factory\\4":Lkotlin/jvm/functions/Function0;
    const/16 v40, 0x0

    .line 854
    .local v40, "$i$f$ReusableComposeNode\\4\\852":I
    move/from16 v17, v10

    const v10, -0x2942ffcf

    move/from16 v41, v0

    .end local v0    # "$changed\\4":I
    .local v41, "$changed\\4":I
    const-string v0, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    invoke-static {v1, v10, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 855
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v0

    instance-of v0, v0, Landroidx/compose/runtime/Applier;

    if-nez v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 856
    :cond_3
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 857
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 858
    move-object/from16 v0, v39

    .end local v39    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .local v0, "factory\\4":Lkotlin/jvm/functions/Function0;
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    .line 860
    .end local v0    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .restart local v39    # "factory\\4":Lkotlin/jvm/functions/Function0;
    :cond_4
    move-object/from16 v0, v39

    .end local v39    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .restart local v0    # "factory\\4":Lkotlin/jvm/functions/Function0;
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 862
    :goto_1
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v10

    .local v10, "$this$Layout_u24lambda_u240\\5":Landroidx/compose/runtime/Composer;
    const/16 v19, 0x0

    .line 863
    .local v19, "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\5\\862\\3":I
    sget-object v20, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    move-object/from16 v39, v0

    .end local v0    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .restart local v39    # "factory\\4":Lkotlin/jvm/functions/Function0;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v10, v6, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 864
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v10, v2, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 866
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    .local v0, "block\\6":Lkotlin/jvm/functions/Function2;
    const/16 v20, 0x0

    .line 867
    .local v20, "$i$f$set-impl\\6\\866":I
    move-object/from16 v21, v10

    .local v21, "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    const/16 v22, 0x0

    .line 868
    .local v22, "$i$a$-with-Updater$set$1\\7\\867\\6":I
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v23

    if-nez v23, :cond_6

    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v42, v2

    .end local v2    # "localMap\\3":Landroidx/compose/runtime/CompositionLocalMap;
    .local v42, "localMap\\3":Landroidx/compose/runtime/CompositionLocalMap;
    invoke-static/range {v38 .. v38}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    move-object/from16 v2, v21

    goto :goto_3

    .end local v42    # "localMap\\3":Landroidx/compose/runtime/CompositionLocalMap;
    .restart local v2    # "localMap\\3":Landroidx/compose/runtime/CompositionLocalMap;
    :cond_6
    move-object/from16 v42, v2

    .line 869
    .end local v2    # "localMap\\3":Landroidx/compose/runtime/CompositionLocalMap;
    .restart local v42    # "localMap\\3":Landroidx/compose/runtime/CompositionLocalMap;
    :goto_2
    invoke-static/range {v38 .. v38}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v21

    .end local v21    # "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    .local v2, "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 870
    invoke-static/range {v38 .. v38}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v10, v1, v0}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 872
    :goto_3
    nop

    .line 867
    .end local v2    # "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    .end local v22    # "$i$a$-with-Updater$set$1\\7\\867\\6":I
    nop

    .line 872
    nop

    .line 873
    .end local v0    # "block\\6":Lkotlin/jvm/functions/Function2;
    .end local v20    # "$i$f$set-impl\\6\\866":I
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v10, v9, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 874
    nop

    .line 862
    .end local v10    # "$this$Layout_u24lambda_u240\\5":Landroidx/compose/runtime/Composer;
    .end local v19    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\5\\862\\3":I
    nop

    .line 875
    shr-int/lit8 v0, v41, 0x6

    and-int/lit8 v0, v0, 0xe

    .local v0, "$changed\\8":I
    move-object/from16 v1, p1

    .local v1, "$composer\\8":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 876
    .local v2, "$i$a$-Layout-ColumnKt$Column$1\\8\\875\\2":I
    const v10, -0x16ef5699

    move/from16 v43, v0

    .end local v0    # "$changed\\8":I
    .local v43, "$changed\\8":I
    const-string v0, "C88@4444L9:Column.kt#2w3rfo"

    invoke-static {v1, v10, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    shr-int/lit8 v10, v33, 0x6

    and-int/lit8 v10, v10, 0x70

    or-int/lit8 v44, v10, 0x6

    .local v44, "$changed\\9":I
    check-cast v0, Landroidx/compose/foundation/layout/ColumnScope;

    .local v0, "$this$invoke_u24lambda_u248\\9":Landroidx/compose/foundation/layout/ColumnScope;
    move-object v10, v1

    .local v10, "$composer\\9":Landroidx/compose/runtime/Composer;
    const/16 v70, 0x0

    .line 497
    .local v70, "$i$a$-Column-MainActivityKt$StWebViewScreen$7$1$1\\9\\876\\0":I
    move-object/from16 v71, v0

    .end local v0    # "$this$invoke_u24lambda_u248\\9":Landroidx/compose/foundation/layout/ColumnScope;
    .local v71, "$this$invoke_u24lambda_u248\\9":Landroidx/compose/foundation/layout/ColumnScope;
    const v0, 0x6285d0da

    move-object/from16 v72, v1

    .end local v1    # "$composer\\8":Landroidx/compose/runtime/Composer;
    .local v72, "$composer\\8":Landroidx/compose/runtime/Composer;
    const-string v1, "C496@19547L10,496@19508L64,497@19589L41,498@19683L10,498@19647L57,499@19721L40,500@19840L10,500@19778L83,501@19878L41,503@19974L266,502@19936L432,512@20385L41,514@20481L352,513@20443L522,525@20982L41,527@21078L187,526@21040L357:MainActivity.kt#r5p2a3"

    invoke-static {v10, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v0, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v1, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v0, v10, v1}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/material3/Typography;->getHeadlineSmall()Landroidx/compose/ui/text/TextStyle;

    move-result-object v65

    const/16 v68, 0x0

    const v69, 0xfffe

    const-string v45, "\u9875\u9762\u6ca1\u6709\u6210\u529f\u6253\u5f00"

    const/16 v46, 0x0

    const-wide/16 v47, 0x0

    const-wide/16 v49, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const-wide/16 v54, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const-wide/16 v58, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v67, 0x6

    move-object/from16 v66, v10

    .end local v10    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .local v66, "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static/range {v45 .. v69}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 498
    move-object/from16 v1, v66

    .end local v66    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .local v1, "$composer\\9":Landroidx/compose/runtime/Composer;
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/16 v10, 0xc

    .local v10, "$this$dp\\10":I
    const/16 v19, 0x0

    .line 877
    .local v19, "$i$f$getDp\\10\\498":I
    move/from16 v73, v2

    .end local v2    # "$i$a$-Layout-ColumnKt$Column$1\\8\\875\\2":I
    .local v73, "$i$a$-Layout-ColumnKt$Column$1\\8\\875\\2":I
    int-to-float v2, v10

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 498
    .end local v10    # "$this$dp\\10":I
    .end local v19    # "$i$f$getDp\\10\\498":I
    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move/from16 v2, v17

    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 499
    sget-object v0, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v10, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v0, v1, v10}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/material3/Typography;->getBodyLarge()Landroidx/compose/ui/text/TextStyle;

    move-result-object v28

    const/16 v31, 0x0

    const v32, 0xfffe

    move-object v0, v9

    .end local v9    # "materialized\\3":Landroidx/compose/ui/Modifier;
    .local v0, "materialized\\3":Landroidx/compose/ui/Modifier;
    const/4 v9, 0x0

    move-object/from16 v17, v11

    const-wide/16 v10, 0x0

    move-object/from16 v19, v12

    move-object/from16 v20, v13

    const-wide/16 v12, 0x0

    move-object/from16 v21, v14

    const/4 v14, 0x0

    move-object/from16 v22, v15

    const/4 v15, 0x0

    move-object/from16 v23, v16

    const/16 v16, 0x0

    move-object/from16 v25, v17

    move-object/from16 v24, v18

    const-wide/16 v17, 0x0

    move-object/from16 v26, v19

    const/16 v19, 0x0

    move-object/from16 v27, v20

    const/16 v20, 0x0

    move-object/from16 v29, v21

    move-object/from16 v30, v22

    const-wide/16 v21, 0x0

    move-object/from16 v45, v23

    const/16 v23, 0x0

    move-object/from16 v46, v24

    const/16 v24, 0x0

    move-object/from16 v47, v25

    const/16 v25, 0x0

    move-object/from16 v48, v26

    const/16 v26, 0x0

    move-object/from16 v49, v27

    const/16 v27, 0x0

    move-object/from16 v50, v30

    const/16 v30, 0x0

    move-object/from16 v78, v0

    move-object/from16 v74, v3

    move-object/from16 v75, v4

    move-object/from16 v76, v5

    move-object/from16 v79, v6

    move-object/from16 v5, v29

    move-object/from16 v0, v47

    move-object/from16 v3, v48

    move-object/from16 v4, v49

    move-object/from16 v77, v50

    move-object/from16 v29, v1

    move v6, v2

    move-object/from16 v1, v45

    move-object/from16 v2, v46

    .end local v0    # "materialized\\3":Landroidx/compose/ui/Modifier;
    .end local v1    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .end local v3    # "modifier\\2":Landroidx/compose/ui/Modifier;
    .end local v6    # "measurePolicy\\2":Landroidx/compose/ui/layout/MeasurePolicy;
    .local v29, "$composer\\9":Landroidx/compose/runtime/Composer;
    .local v74, "modifier\\2":Landroidx/compose/ui/Modifier;
    .local v78, "materialized\\3":Landroidx/compose/ui/Modifier;
    .local v79, "measurePolicy\\2":Landroidx/compose/ui/layout/MeasurePolicy;
    invoke-static/range {v8 .. v32}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 500
    move-object/from16 v8, v29

    .end local v29    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .local v8, "$composer\\9":Landroidx/compose/runtime/Composer;
    sget-object v9, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v9, Landroidx/compose/ui/Modifier;

    const/16 v10, 0x8

    .local v10, "$this$dp\\11":I
    const/4 v11, 0x0

    .line 878
    .local v11, "$i$f$getDp\\11\\500":I
    int-to-float v12, v10

    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v10

    .line 500
    .end local v10    # "$this$dp\\11":I
    .end local v11    # "$i$f$getDp\\11\\500":I
    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v9, v8, v6}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 501
    invoke-static/range {v77 .. v77}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$26(Landroidx/compose/runtime/MutableState;)Lcom/stshell/app/PageState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/stshell/app/PageState;->getLastUrl()Ljava/lang/String;

    move-result-object v9

    move-object v11, v9

    check-cast v11, Ljava/lang/CharSequence;

    invoke-static {v11}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_7

    .line 879
    const/4 v9, 0x0

    .line 501
    .local v9, "$i$a$-ifBlank-MainActivityKt$StWebViewScreen$7$1$1$1\\12\\501\\9":I
    move-object v11, v0

    .end local v9    # "$i$a$-ifBlank-MainActivityKt$StWebViewScreen$7$1$1$1\\12\\501\\9":I
    :cond_7
    move-object/from16 v45, v11

    check-cast v45, Ljava/lang/String;

    sget-object v9, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v10, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v9, v8, v10}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v9

    invoke-virtual {v9}, Landroidx/compose/material3/Typography;->getBodySmall()Landroidx/compose/ui/text/TextStyle;

    move-result-object v65

    const/16 v68, 0x0

    const v69, 0xfffe

    const/16 v46, 0x0

    const-wide/16 v47, 0x0

    const-wide/16 v49, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const-wide/16 v54, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const-wide/16 v58, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v67, 0x0

    move-object/from16 v66, v8

    .end local v8    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v66    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static/range {v45 .. v69}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 502
    .end local v66    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v8    # "$composer\\9":Landroidx/compose/runtime/Composer;
    sget-object v9, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v9, Landroidx/compose/ui/Modifier;

    const/16 v10, 0x14

    .local v10, "$this$dp\\13":I
    const/4 v11, 0x0

    .line 880
    .local v11, "$i$f$getDp\\13\\502":I
    int-to-float v12, v10

    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v10

    .line 502
    .end local v10    # "$this$dp\\13":I
    .end local v11    # "$i$f$getDp\\13\\502":I
    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v9, v8, v6}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const v9, -0x2e5e93ce

    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v15, "CC(remember):MainActivity.kt#9igjgp"

    invoke-static {v8, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    .line 504
    move-object v10, v8

    .local v10, "$this$cache\\14":Landroidx/compose/runtime/Composer;
    move/from16 v16, v9

    .local v16, "invalid\\14":Z
    const/16 v17, 0x0

    .line 881
    .local v17, "$i$f$cache\\14\\504":I
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    .local v9, "it\\14":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 882
    .local v18, "$i$a$-let-ComposerKt$cache$1\\15\\881\\14":I
    if-nez v16, :cond_9

    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v11

    if-ne v9, v11, :cond_8

    goto :goto_4

    .line 886
    :cond_8
    move-object v12, v0

    move-object v11, v2

    move-object v0, v10

    move-object/from16 v13, v77

    move-object v10, v1

    move-object v1, v9

    goto :goto_5

    .line 883
    :cond_9
    :goto_4
    const/16 v19, 0x0

    .line 504
    .local v19, "$i$a$-cache-MainActivityKt$StWebViewScreen$7$1$1$2\\16\\883\\9":I
    move-object v11, v9

    .end local v9    # "it\\14":Ljava/lang/Object;
    .local v11, "it\\14":Ljava/lang/Object;
    new-instance v9, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1$$ExternalSyntheticLambda0;

    move-object v12, v0

    move-object v0, v10

    move-object/from16 v14, v75

    move-object/from16 v13, v77

    move-object v10, v1

    move-object v1, v11

    move-object v11, v2

    .end local v10    # "$this$cache\\14":Landroidx/compose/runtime/Composer;
    .end local v11    # "it\\14":Ljava/lang/Object;
    .local v0, "$this$cache\\14":Landroidx/compose/runtime/Composer;
    .local v1, "it\\14":Ljava/lang/Object;
    invoke-direct/range {v9 .. v14}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1$$ExternalSyntheticLambda0;-><init>(Lcom/stshell/app/HttpAuthCredentialsStore;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V

    .line 883
    .end local v19    # "$i$a$-cache-MainActivityKt$StWebViewScreen$7$1$1$2\\16\\883\\9":I
    nop

    .line 884
    .local v9, "value\\15":Ljava/lang/Object;
    invoke-interface {v0, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 885
    nop

    .line 882
    .end local v9    # "value\\15":Ljava/lang/Object;
    :goto_5
    nop

    .line 881
    .end local v1    # "it\\14":Ljava/lang/Object;
    .end local v18    # "$i$a$-let-ComposerKt$cache$1\\15\\881\\14":I
    nop

    .line 504
    .end local v0    # "$this$cache\\14":Landroidx/compose/runtime/Composer;
    .end local v16    # "invalid\\14":Z
    .end local v17    # "$i$f$cache\\14\\504":I
    move-object/from16 v19, v9

    check-cast v19, Lkotlin/jvm/functions/Function0;

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 509
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v9, 0x0

    invoke-static {v0, v9, v2, v1}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    sget-object v0, Lcom/stshell/app/ComposableSingletons$MainActivityKt;->INSTANCE:Lcom/stshell/app/ComposableSingletons$MainActivityKt;

    invoke-virtual {v0}, Lcom/stshell/app/ComposableSingletons$MainActivityKt;->getLambda-2$app_debug()Lkotlin/jvm/functions/Function3;

    move-result-object v28

    .line 503
    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const v30, 0x30000030

    const/16 v31, 0x1fc

    move-object/from16 v29, v8

    .end local v8    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v29    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static/range {v19 .. v31}, Landroidx/compose/material3/ButtonKt;->Button(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 513
    .end local v29    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v8    # "$composer\\9":Landroidx/compose/runtime/Composer;
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/16 v1, 0xc

    .local v1, "$this$dp\\17":I
    const/4 v2, 0x0

    .line 887
    .local v2, "$i$f$getDp\\17\\513":I
    int-to-float v9, v1

    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 513
    .end local v1    # "$this$dp\\17":I
    .end local v2    # "$i$f$getDp\\17\\513":I
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v8, v6}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const v0, -0x2e5e5418

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v8, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v8, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-interface {v8, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    .line 515
    move-object v1, v8

    .local v0, "invalid\\18":Z
    .local v1, "$this$cache\\18":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 888
    .local v2, "$i$f$cache\\18\\515":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    .local v9, "it\\18":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 889
    .local v17, "$i$a$-let-ComposerKt$cache$1\\19\\888\\18":I
    if-nez v0, :cond_b

    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v14

    if-ne v9, v14, :cond_a

    goto :goto_6

    .line 893
    :cond_a
    move-object v3, v9

    move-object v4, v15

    goto :goto_7

    .line 890
    :cond_b
    :goto_6
    const/16 v18, 0x0

    .line 515
    .local v18, "$i$a$-cache-MainActivityKt$StWebViewScreen$7$1$1$3\\20\\890\\9":I
    move-object v14, v9

    .end local v9    # "it\\18":Ljava/lang/Object;
    .local v14, "it\\18":Ljava/lang/Object;
    new-instance v9, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1$$ExternalSyntheticLambda1;

    move-object/from16 v16, v13

    move-object v13, v3

    move-object v3, v14

    move-object v14, v4

    move-object v4, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v76

    .end local v14    # "it\\18":Ljava/lang/Object;
    .local v3, "it\\18":Ljava/lang/Object;
    invoke-direct/range {v9 .. v16}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1$$ExternalSyntheticLambda1;-><init>(Lcom/stshell/app/HttpAuthCredentialsStore;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V

    .line 890
    move-object v13, v15

    .line 891
    .end local v18    # "$i$a$-cache-MainActivityKt$StWebViewScreen$7$1$1$3\\20\\890\\9":I
    .local v9, "value\\19":Ljava/lang/Object;
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 892
    nop

    .line 889
    .end local v9    # "value\\19":Ljava/lang/Object;
    :goto_7
    nop

    .line 888
    .end local v3    # "it\\18":Ljava/lang/Object;
    .end local v17    # "$i$a$-let-ComposerKt$cache$1\\19\\888\\18":I
    nop

    .line 515
    .end local v0    # "invalid\\18":Z
    .end local v1    # "$this$cache\\18":Landroidx/compose/runtime/Composer;
    .end local v2    # "$i$f$cache\\18\\515":I
    move-object/from16 v19, v9

    check-cast v19, Lkotlin/jvm/functions/Function0;

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 522
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v9, 0x0

    invoke-static {v0, v9, v2, v1}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    sget-object v0, Lcom/stshell/app/ComposableSingletons$MainActivityKt;->INSTANCE:Lcom/stshell/app/ComposableSingletons$MainActivityKt;

    invoke-virtual {v0}, Lcom/stshell/app/ComposableSingletons$MainActivityKt;->getLambda-3$app_debug()Lkotlin/jvm/functions/Function3;

    move-result-object v28

    .line 514
    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const v30, 0x30000030

    const/16 v31, 0x1fc

    move-object/from16 v29, v8

    .end local v8    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v29    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static/range {v19 .. v31}, Landroidx/compose/material3/ButtonKt;->Button(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 526
    .end local v29    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v8    # "$composer\\9":Landroidx/compose/runtime/Composer;
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/16 v1, 0xc

    .local v1, "$this$dp\\21":I
    const/4 v2, 0x0

    .line 894
    .local v2, "$i$f$getDp\\21\\526":I
    int-to-float v3, v1

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 526
    .end local v1    # "$this$dp\\21":I
    .end local v2    # "$i$f$getDp\\21\\526":I
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v8, v6}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const v0, -0x2e5e0a1d

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v8, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-interface {v8, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    .line 528
    move-object v1, v8

    .local v0, "invalid\\22":Z
    .local v1, "$this$cache\\22":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 895
    .local v2, "$i$f$cache\\22\\528":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .local v3, "it\\22":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 896
    .local v4, "$i$a$-let-ComposerKt$cache$1\\23\\895\\22":I
    if-nez v0, :cond_d

    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v3, v6, :cond_c

    goto :goto_8

    .line 900
    :cond_c
    move-object v9, v3

    goto :goto_9

    .line 897
    :cond_d
    :goto_8
    const/4 v6, 0x0

    .line 528
    .local v6, "$i$a$-cache-MainActivityKt$StWebViewScreen$7$1$1$4\\24\\897\\9":I
    new-instance v9, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1$$ExternalSyntheticLambda2;

    invoke-direct {v9, v5, v13, v12}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$7$1$$ExternalSyntheticLambda2;-><init>(Landroid/content/Context;Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 897
    .end local v6    # "$i$a$-cache-MainActivityKt$StWebViewScreen$7$1$1$4\\24\\897\\9":I
    nop

    .line 898
    .local v9, "value\\23":Ljava/lang/Object;
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 899
    nop

    .line 896
    .end local v9    # "value\\23":Ljava/lang/Object;
    :goto_9
    nop

    .line 895
    .end local v3    # "it\\22":Ljava/lang/Object;
    .end local v4    # "$i$a$-let-ComposerKt$cache$1\\23\\895\\22":I
    nop

    .line 528
    .end local v0    # "invalid\\22":Z
    .end local v1    # "$this$cache\\22":Landroidx/compose/runtime/Composer;
    .end local v2    # "$i$f$cache\\22\\528":I
    move-object/from16 v19, v9

    check-cast v19, Lkotlin/jvm/functions/Function0;

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 532
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v9, 0x0

    invoke-static {v0, v9, v2, v1}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    sget-object v0, Lcom/stshell/app/ComposableSingletons$MainActivityKt;->INSTANCE:Lcom/stshell/app/ComposableSingletons$MainActivityKt;

    invoke-virtual {v0}, Lcom/stshell/app/ComposableSingletons$MainActivityKt;->getLambda-4$app_debug()Lkotlin/jvm/functions/Function3;

    move-result-object v28

    .line 527
    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const v30, 0x30000030

    const/16 v31, 0x1fc

    move-object/from16 v29, v8

    .end local v8    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v29    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static/range {v19 .. v31}, Landroidx/compose/material3/ButtonKt;->Button(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 497
    invoke-static/range {v29 .. v29}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 536
    nop

    .line 876
    .end local v29    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .end local v44    # "$changed\\9":I
    .end local v70    # "$i$a$-Column-MainActivityKt$StWebViewScreen$7$1$1\\9\\876\\0":I
    .end local v71    # "$this$invoke_u24lambda_u248\\9":Landroidx/compose/foundation/layout/ColumnScope;
    invoke-static/range {v72 .. v72}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 875
    .end local v43    # "$changed\\8":I
    .end local v72    # "$composer\\8":Landroidx/compose/runtime/Composer;
    .end local v73    # "$i$a$-Layout-ColumnKt$Column$1\\8\\875\\2":I
    nop

    .line 901
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 854
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 902
    nop

    .line 848
    .end local v39    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .end local v40    # "$i$f$ReusableComposeNode\\4\\852":I
    .end local v41    # "$changed\\4":I
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 903
    nop

    .line 842
    .end local v35    # "$changed\\3":I
    .end local v36    # "$i$f$Layout\\3\\847":I
    .end local v38    # "compositeKeyHash\\3":I
    .end local v42    # "localMap\\3":Landroidx/compose/runtime/CompositionLocalMap;
    .end local v78    # "materialized\\3":Landroidx/compose/ui/Modifier;
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 904
    nop

    .end local v7    # "verticalArrangement\\2":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local v33    # "$changed\\2":I
    .end local v34    # "$i$f$Column\\2\\491":I
    .end local v37    # "horizontalAlignment\\2":Landroidx/compose/ui/Alignment$Horizontal;
    .end local v74    # "modifier\\2":Landroidx/compose/ui/Modifier;
    .end local v79    # "measurePolicy\\2":Landroidx/compose/ui/layout/MeasurePolicy;
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 537
    :cond_e
    :goto_a
    return-void
.end method
