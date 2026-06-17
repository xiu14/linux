.class public final synthetic Lcom/stshell/app/MainActivityKt$$ExternalSyntheticLambda7;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function2;

.field public final synthetic f$1:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$2:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$3:Lcom/stshell/app/HttpAuthCredentialsStore;

.field public final synthetic f$4:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$5:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$6:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$7:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/stshell/app/HttpAuthCredentialsStore;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stshell/app/MainActivityKt$$ExternalSyntheticLambda7;->f$0:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lcom/stshell/app/MainActivityKt$$ExternalSyntheticLambda7;->f$1:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/stshell/app/MainActivityKt$$ExternalSyntheticLambda7;->f$2:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/stshell/app/MainActivityKt$$ExternalSyntheticLambda7;->f$3:Lcom/stshell/app/HttpAuthCredentialsStore;

    iput-object p5, p0, Lcom/stshell/app/MainActivityKt$$ExternalSyntheticLambda7;->f$4:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/stshell/app/MainActivityKt$$ExternalSyntheticLambda7;->f$5:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/stshell/app/MainActivityKt$$ExternalSyntheticLambda7;->f$6:Landroidx/compose/runtime/MutableState;

    iput-object p8, p0, Lcom/stshell/app/MainActivityKt$$ExternalSyntheticLambda7;->f$7:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 0
    iget-object v0, p0, Lcom/stshell/app/MainActivityKt$$ExternalSyntheticLambda7;->f$0:Lkotlin/jvm/functions/Function2;

    iget-object v1, p0, Lcom/stshell/app/MainActivityKt$$ExternalSyntheticLambda7;->f$1:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lcom/stshell/app/MainActivityKt$$ExternalSyntheticLambda7;->f$2:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Lcom/stshell/app/MainActivityKt$$ExternalSyntheticLambda7;->f$3:Lcom/stshell/app/HttpAuthCredentialsStore;

    iget-object v4, p0, Lcom/stshell/app/MainActivityKt$$ExternalSyntheticLambda7;->f$4:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/stshell/app/MainActivityKt$$ExternalSyntheticLambda7;->f$5:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/stshell/app/MainActivityKt$$ExternalSyntheticLambda7;->f$6:Landroidx/compose/runtime/MutableState;

    iget-object v7, p0, Lcom/stshell/app/MainActivityKt$$ExternalSyntheticLambda7;->f$7:Landroidx/compose/runtime/MutableState;

    move-object v8, p1

    check-cast v8, Landroid/content/Context;

    invoke-static/range {v0 .. v8}, Lcom/stshell/app/MainActivityKt;->$r8$lambda$odYJsPBAJDEQGCBijdTAGoS_jhE(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/stshell/app/HttpAuthCredentialsStore;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroid/content/Context;)Landroid/webkit/WebView;

    move-result-object p1

    return-object p1
.end method
