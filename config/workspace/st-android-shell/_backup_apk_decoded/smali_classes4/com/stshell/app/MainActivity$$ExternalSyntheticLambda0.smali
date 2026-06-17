.class public final synthetic Lcom/stshell/app/MainActivity$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic f$0:Lcom/stshell/app/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stshell/app/MainActivity;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stshell/app/MainActivity$$ExternalSyntheticLambda0;->f$0:Lcom/stshell/app/MainActivity;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stshell/app/MainActivity$$ExternalSyntheticLambda0;->f$0:Lcom/stshell/app/MainActivity;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, p1}, Lcom/stshell/app/MainActivity;->$r8$lambda$GttmreRiS1RT9WYPqsnr_fhtW2w(Lcom/stshell/app/MainActivity;Z)V

    return-void
.end method
