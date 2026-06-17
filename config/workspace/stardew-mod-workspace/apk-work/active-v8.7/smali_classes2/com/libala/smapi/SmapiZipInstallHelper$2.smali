.class Lcom/libala/smapi/SmapiZipInstallHelper$2;
.super Ljava/lang/Object;
.source "SmapiZipInstallHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/libala/smapi/SmapiZipInstallHelper;->installInBackground(Landroid/app/Activity;Landroid/net/Uri;)V
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

    .line 76
    iput-object p1, p0, Lcom/libala/smapi/SmapiZipInstallHelper$2;->val$activity:Landroid/app/Activity;

    iput-object p2, p0, Lcom/libala/smapi/SmapiZipInstallHelper$2;->val$uri:Landroid/net/Uri;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 80
    :try_start_0
    iget-object v0, p0, Lcom/libala/smapi/SmapiZipInstallHelper$2;->val$activity:Landroid/app/Activity;

    iget-object v1, p0, Lcom/libala/smapi/SmapiZipInstallHelper$2;->val$uri:Landroid/net/Uri;

    invoke-static {v0, v1}, Lcom/libala/smapi/SmapiZipInstallHelper;->access$100(Landroid/app/Activity;Landroid/net/Uri;)Lcom/libala/smapi/SmapiZipInstallHelper$InstallResult;

    move-result-object v0

    .line 81
    iget-object v1, p0, Lcom/libala/smapi/SmapiZipInstallHelper$2;->val$activity:Landroid/app/Activity;

    new-instance v2, Lcom/libala/smapi/SmapiZipInstallHelper$2$1;

    invoke-direct {v2, p0, v0}, Lcom/libala/smapi/SmapiZipInstallHelper$2$1;-><init>(Lcom/libala/smapi/SmapiZipInstallHelper$2;Lcom/libala/smapi/SmapiZipInstallHelper$InstallResult;)V

    invoke-static {v1, v2}, Lcom/libala/smapi/SmapiZipInstallHelper;->access$200(Landroid/app/Activity;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    goto :goto_0

    .line 91
    :catchall_0
    move-exception v0

    .line 92
    iget-object v1, p0, Lcom/libala/smapi/SmapiZipInstallHelper$2;->val$activity:Landroid/app/Activity;

    invoke-static {v1, v0}, Lcom/libala/smapi/SmapiZipInstallHelper;->access$300(Landroid/app/Activity;Ljava/lang/Throwable;)V

    .line 93
    iget-object v1, p0, Lcom/libala/smapi/SmapiZipInstallHelper$2;->val$activity:Landroid/app/Activity;

    new-instance v2, Lcom/libala/smapi/SmapiZipInstallHelper$2$2;

    invoke-direct {v2, p0, v0}, Lcom/libala/smapi/SmapiZipInstallHelper$2$2;-><init>(Lcom/libala/smapi/SmapiZipInstallHelper$2;Ljava/lang/Throwable;)V

    invoke-static {v1, v2}, Lcom/libala/smapi/SmapiZipInstallHelper;->access$200(Landroid/app/Activity;Ljava/lang/Runnable;)V

    .line 100
    :goto_0
    return-void
.end method
