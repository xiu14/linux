.class Lcom/libala/smapi/BackupImportHelper$2;
.super Ljava/lang/Object;
.source "BackupImportHelper.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/libala/smapi/BackupImportHelper;->onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$activity:Landroid/app/Activity;

.field final synthetic val$uri:Landroid/net/Uri;


# direct methods
.method constructor <init>(Landroid/app/Activity;Landroid/net/Uri;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 68
    iput-object p1, p0, Lcom/libala/smapi/BackupImportHelper$2;->val$activity:Landroid/app/Activity;

    iput-object p2, p0, Lcom/libala/smapi/BackupImportHelper$2;->val$uri:Landroid/net/Uri;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 71
    iget-object p1, p0, Lcom/libala/smapi/BackupImportHelper$2;->val$activity:Landroid/app/Activity;

    iget-object p2, p0, Lcom/libala/smapi/BackupImportHelper$2;->val$uri:Landroid/net/Uri;

    invoke-static {p1, p2}, Lcom/libala/smapi/BackupImportHelper;->access$000(Landroid/app/Activity;Landroid/net/Uri;)V

    .line 72
    return-void
.end method
