.class final Lcom/stshell/app/MainActivity$onCreate$1$1$1;
.super Ljava/lang/Object;
.source "MainActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stshell/app/MainActivity$onCreate$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/stshell/app/MainActivity$onCreate$1$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,840:1\n1225#2,6:841\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/stshell/app/MainActivity$onCreate$1$1$1\n*L\n113#1:841,6\n*E\n"
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
.field final synthetic this$0:Lcom/stshell/app/MainActivity;


# direct methods
.method constructor <init>(Lcom/stshell/app/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/stshell/app/MainActivity$onCreate$1$1$1;->this$0:Lcom/stshell/app/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1, "p1"    # Ljava/lang/Object;
    .param p2, "p2"    # Ljava/lang/Object;

    .line 109
    move-object v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/stshell/app/MainActivity$onCreate$1$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 9
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    const-string v0, "C112@4398L19,109@4211L229:MainActivity.kt#r5p2a3"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 110
    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 114
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_3

    .line 110
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stshell.app.MainActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:109)"

    const v2, -0x5dc52b36

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 111
    :cond_2
    nop

    .line 112
    new-instance v0, Lcom/stshell/app/HttpAuthCredentialsStore;

    iget-object v1, p0, Lcom/stshell/app/MainActivity$onCreate$1$1$1;->this$0:Lcom/stshell/app/MainActivity;

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/stshell/app/HttpAuthCredentialsStore;-><init>(Landroid/content/Context;)V

    .line 113
    iget-object v1, p0, Lcom/stshell/app/MainActivity$onCreate$1$1$1;->this$0:Lcom/stshell/app/MainActivity;

    const v2, -0x2bb690c8

    invoke-interface {p1, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "CC(remember):MainActivity.kt#9igjgp"

    invoke-static {p1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    .local v2, "invalid\\1":Z
    move-object v3, p1

    .local v3, "$this$cache\\1":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 841
    .local v4, "$i$f$cache\\1\\113":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it\\1":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 842
    .local v6, "$i$a$-let-ComposerKt$cache$1\\2\\841\\1":I
    if-nez v2, :cond_4

    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v5, v7, :cond_3

    goto :goto_1

    .line 846
    :cond_3
    move-object v8, v5

    goto :goto_2

    .line 843
    :cond_4
    :goto_1
    const/4 v7, 0x0

    .line 113
    .local v7, "$i$a$-cache-MainActivity$onCreate$1$1$1$1\\3\\843\\0":I
    new-instance v8, Lcom/stshell/app/MainActivity$onCreate$1$1$1$1$1;

    invoke-direct {v8, v1}, Lcom/stshell/app/MainActivity$onCreate$1$1$1$1$1;-><init>(Ljava/lang/Object;)V

    check-cast v8, Lkotlin/reflect/KFunction;

    .line 843
    .end local v7    # "$i$a$-cache-MainActivity$onCreate$1$1$1$1\\3\\843\\0":I
    nop

    .line 844
    .local v8, "value\\2":Ljava/lang/Object;
    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 845
    nop

    .line 842
    .end local v8    # "value\\2":Ljava/lang/Object;
    :goto_2
    nop

    .line 841
    .end local v5    # "it\\1":Ljava/lang/Object;
    .end local v6    # "$i$a$-let-ComposerKt$cache$1\\2\\841\\1":I
    nop

    .line 113
    .end local v2    # "invalid\\1":Z
    .end local v3    # "$this$cache\\1":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache\\1\\113":I
    check-cast v8, Lkotlin/reflect/KFunction;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 110
    const-string v1, "https://st.xiuzai.space/"

    const/4 v2, 0x6

    invoke-static {v1, v0, v8, p1, v2}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen(Ljava/lang/String;Lcom/stshell/app/HttpAuthCredentialsStore;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 115
    :cond_5
    :goto_3
    return-void
.end method
