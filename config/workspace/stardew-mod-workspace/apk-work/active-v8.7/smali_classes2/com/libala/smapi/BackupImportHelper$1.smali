.class Lcom/libala/smapi/BackupImportHelper$1;
.super Ljava/lang/Object;
.source "BackupImportHelper.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/libala/smapi/BackupImportHelper;->wireImportButton(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$activity:Landroid/app/Activity;


# direct methods
.method constructor <init>(Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 35
    iput-object p1, p0, Lcom/libala/smapi/BackupImportHelper$1;->val$activity:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 38
    iget-object p1, p0, Lcom/libala/smapi/BackupImportHelper$1;->val$activity:Landroid/app/Activity;

    invoke-static {p1}, Lcom/libala/smapi/BackupImportHelper;->startImport(Landroid/app/Activity;)V

    .line 39
    return-void
.end method
