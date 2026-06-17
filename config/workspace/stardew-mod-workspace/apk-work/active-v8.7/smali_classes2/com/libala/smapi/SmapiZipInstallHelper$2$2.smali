.class Lcom/libala/smapi/SmapiZipInstallHelper$2$2;
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

.field final synthetic val$ex:Ljava/lang/Throwable;


# direct methods
.method constructor <init>(Lcom/libala/smapi/SmapiZipInstallHelper$2;Ljava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 93
    iput-object p1, p0, Lcom/libala/smapi/SmapiZipInstallHelper$2$2;->this$0:Lcom/libala/smapi/SmapiZipInstallHelper$2;

    iput-object p2, p0, Lcom/libala/smapi/SmapiZipInstallHelper$2$2;->val$ex:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 96
    iget-object v0, p0, Lcom/libala/smapi/SmapiZipInstallHelper$2$2;->this$0:Lcom/libala/smapi/SmapiZipInstallHelper$2;

    iget-object v0, v0, Lcom/libala/smapi/SmapiZipInstallHelper$2;->val$activity:Landroid/app/Activity;

    const-string v1, "SMAPI \u5b89\u88c5\u5931\u8d25"

    iget-object v2, p0, Lcom/libala/smapi/SmapiZipInstallHelper$2$2;->val$ex:Ljava/lang/Throwable;

    invoke-static {v0, v1, v2}, Lcom/libala/smapi/SmapiZipInstallHelper;->access$400(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 97
    return-void
.end method
