.class Lcom/libala/smapi/LogExportHelper$1;
.super Ljava/lang/Object;
.source "LogExportHelper.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/libala/smapi/LogExportHelper;->wireLogExportButton(Landroid/app/Activity;)V
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

    .line 45
    iput-object p1, p0, Lcom/libala/smapi/LogExportHelper$1;->val$activity:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 48
    iget-object p1, p0, Lcom/libala/smapi/LogExportHelper$1;->val$activity:Landroid/app/Activity;

    invoke-static {p1}, Lcom/libala/smapi/LogExportHelper;->access$000(Landroid/app/Activity;)V

    .line 49
    return-void
.end method
