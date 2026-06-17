.class Lcom/libala/smapi/LogExportHelper$2$1;
.super Ljava/lang/Object;
.source "LogExportHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/libala/smapi/LogExportHelper$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/libala/smapi/LogExportHelper$2;

.field final synthetic val$message:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/libala/smapi/LogExportHelper$2;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 73
    iput-object p1, p0, Lcom/libala/smapi/LogExportHelper$2$1;->this$0:Lcom/libala/smapi/LogExportHelper$2;

    iput-object p2, p0, Lcom/libala/smapi/LogExportHelper$2$1;->val$message:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 76
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/libala/smapi/LogExportHelper$2$1;->this$0:Lcom/libala/smapi/LogExportHelper$2;

    iget-object v1, v1, Lcom/libala/smapi/LogExportHelper$2;->val$activity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 77
    const-string v1, "\u65e5\u5fd7\u5305\u5df2\u5bfc\u51fa"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/libala/smapi/LogExportHelper$2$1;->val$message:Ljava/lang/String;

    .line 78
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 79
    const-string v1, "\u786e\u5b9a"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 80
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 81
    return-void
.end method
