.class Lcom/libala/smapi/SmapiZipInstallHelper$2$1;
.super Ljava/lang/Object;
.source "SmapiZipInstallHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/libala/smapi/SmapiZipInstallHelper$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/libala/smapi/SmapiZipInstallHelper$2;

.field final synthetic val$result:Lcom/libala/smapi/SmapiZipInstallHelper$InstallResult;


# direct methods
.method constructor <init>(Lcom/libala/smapi/SmapiZipInstallHelper$2;Lcom/libala/smapi/SmapiZipInstallHelper$InstallResult;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 81
    iput-object p1, p0, Lcom/libala/smapi/SmapiZipInstallHelper$2$1;->this$0:Lcom/libala/smapi/SmapiZipInstallHelper$2;

    iput-object p2, p0, Lcom/libala/smapi/SmapiZipInstallHelper$2$1;->val$result:Lcom/libala/smapi/SmapiZipInstallHelper$InstallResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 84
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/libala/smapi/SmapiZipInstallHelper$2$1;->this$0:Lcom/libala/smapi/SmapiZipInstallHelper$2;

    iget-object v1, v1, Lcom/libala/smapi/SmapiZipInstallHelper$2;->val$activity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 85
    const-string v1, "SMAPI \u5b89\u88c5\u5b8c\u6210"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u5df2\u5b89\u88c5 "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/libala/smapi/SmapiZipInstallHelper$2$1;->val$result:Lcom/libala/smapi/SmapiZipInstallHelper$InstallResult;

    iget v2, v2, Lcom/libala/smapi/SmapiZipInstallHelper$InstallResult;->files:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " \u4e2a\u6587\u4ef6\u3002\n\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/libala/smapi/SmapiZipInstallHelper$2$1;->val$result:Lcom/libala/smapi/SmapiZipInstallHelper$InstallResult;

    iget-object v2, v2, Lcom/libala/smapi/SmapiZipInstallHelper$InstallResult;->name:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 86
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 87
    const-string v1, "\u786e\u5b9a"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 88
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 89
    return-void
.end method
