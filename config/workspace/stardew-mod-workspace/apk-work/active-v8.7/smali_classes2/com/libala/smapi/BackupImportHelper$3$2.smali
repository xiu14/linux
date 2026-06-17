.class Lcom/libala/smapi/BackupImportHelper$3$2;
.super Ljava/lang/Object;
.source "BackupImportHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/libala/smapi/BackupImportHelper$3;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/libala/smapi/BackupImportHelper$3;

.field final synthetic val$ex:Ljava/lang/Throwable;


# direct methods
.method constructor <init>(Lcom/libala/smapi/BackupImportHelper$3;Ljava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 97
    iput-object p1, p0, Lcom/libala/smapi/BackupImportHelper$3$2;->this$0:Lcom/libala/smapi/BackupImportHelper$3;

    iput-object p2, p0, Lcom/libala/smapi/BackupImportHelper$3$2;->val$ex:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 100
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/libala/smapi/BackupImportHelper$3$2;->this$0:Lcom/libala/smapi/BackupImportHelper$3;

    iget-object v1, v1, Lcom/libala/smapi/BackupImportHelper$3;->val$activity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 101
    const-string v1, "\u5bfc\u5165\u5b8c\u6574\u5907\u4efd\u5931\u8d25"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/libala/smapi/BackupImportHelper$3$2;->val$ex:Ljava/lang/Throwable;

    .line 102
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 103
    const-string v1, "\u786e\u5b9a"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 104
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 105
    return-void
.end method
