.class Lcom/libala/smapi/ModArchiveInstallHelper$1;
.super Ljava/lang/Object;
.source "ModArchiveInstallHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/libala/smapi/ModArchiveInstallHelper;->wireInstallModButton(Landroid/app/Activity;)V
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

    .line 46
    iput-object p1, p0, Lcom/libala/smapi/ModArchiveInstallHelper$1;->val$activity:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/libala/smapi/ModArchiveInstallHelper$1;->val$activity:Landroid/app/Activity;

    invoke-static {v0}, Lcom/libala/smapi/ModArchiveInstallHelper;->access$000(Landroid/app/Activity;)V

    .line 50
    return-void
.end method
