.class Lcom/libala/smapi/ModArchiveInstallHelper$3$1;
.super Ljava/lang/Object;
.source "ModArchiveInstallHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/libala/smapi/ModArchiveInstallHelper$3;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/libala/smapi/ModArchiveInstallHelper$3;

.field final synthetic val$message:Ljava/lang/String;

.field final synthetic val$title:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/libala/smapi/ModArchiveInstallHelper$3;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 188
    iput-object p1, p0, Lcom/libala/smapi/ModArchiveInstallHelper$3$1;->this$0:Lcom/libala/smapi/ModArchiveInstallHelper$3;

    iput-object p2, p0, Lcom/libala/smapi/ModArchiveInstallHelper$3$1;->val$title:Ljava/lang/String;

    iput-object p3, p0, Lcom/libala/smapi/ModArchiveInstallHelper$3$1;->val$message:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 191
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/libala/smapi/ModArchiveInstallHelper$3$1;->this$0:Lcom/libala/smapi/ModArchiveInstallHelper$3;

    iget-object v1, v1, Lcom/libala/smapi/ModArchiveInstallHelper$3;->val$activity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/libala/smapi/ModArchiveInstallHelper$3$1;->val$title:Ljava/lang/String;

    .line 192
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/libala/smapi/ModArchiveInstallHelper$3$1;->val$message:Ljava/lang/String;

    .line 193
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 194
    const-string v1, "\u786e\u5b9a"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 195
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 196
    return-void
.end method
