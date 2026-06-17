.class Lcom/libala/smapi/LogExportHelper$2;
.super Ljava/lang/Object;
.source "LogExportHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/libala/smapi/LogExportHelper;->exportInBackground(Landroid/app/Activity;)V
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

    .line 58
    iput-object p1, p0, Lcom/libala/smapi/LogExportHelper$2;->val$activity:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 61
    nop

    .line 63
    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SMAPI-logs-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v3, "yyyyMMdd-HHmmss"

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v2, v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".zip"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 64
    iget-object v2, p0, Lcom/libala/smapi/LogExportHelper$2;->val$activity:Landroid/app/Activity;

    invoke-static {v2, v1}, Lcom/libala/smapi/LogExportHelper;->access$100(Landroid/app/Activity;Ljava/lang/String;)Lcom/libala/smapi/LogExportHelper$OutputTarget;

    move-result-object v0

    .line 65
    new-instance v1, Ljava/util/zip/ZipOutputStream;

    iget-object v2, v0, Lcom/libala/smapi/LogExportHelper$OutputTarget;->output:Ljava/io/OutputStream;

    invoke-direct {v1, v2}, Ljava/util/zip/ZipOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 67
    :try_start_1
    iget-object v2, p0, Lcom/libala/smapi/LogExportHelper$2;->val$activity:Landroid/app/Activity;

    invoke-static {v2, v1}, Lcom/libala/smapi/LogExportHelper;->access$200(Landroid/app/Activity;Ljava/util/zip/ZipOutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    :try_start_2
    invoke-virtual {v1}, Ljava/util/zip/ZipOutputStream;->close()V

    .line 70
    nop

    .line 71
    iget-object v1, p0, Lcom/libala/smapi/LogExportHelper$2;->val$activity:Landroid/app/Activity;

    invoke-static {v1, v0}, Lcom/libala/smapi/LogExportHelper;->access$300(Landroid/app/Activity;Lcom/libala/smapi/LogExportHelper$OutputTarget;)V

    .line 72
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u5df2\u5bfc\u51fa\u5230\uff1a"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v0, Lcom/libala/smapi/LogExportHelper$OutputTarget;->displayPath:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 73
    iget-object v2, p0, Lcom/libala/smapi/LogExportHelper$2;->val$activity:Landroid/app/Activity;

    new-instance v3, Lcom/libala/smapi/LogExportHelper$2$1;

    invoke-direct {v3, p0, v1}, Lcom/libala/smapi/LogExportHelper$2$1;-><init>(Lcom/libala/smapi/LogExportHelper$2;Ljava/lang/String;)V

    invoke-static {v2, v3}, Lcom/libala/smapi/LogExportHelper;->access$400(Landroid/app/Activity;Ljava/lang/Runnable;)V

    .line 95
    goto :goto_0

    .line 69
    :catchall_0
    move-exception v2

    invoke-virtual {v1}, Ljava/util/zip/ZipOutputStream;->close()V

    .line 70
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 83
    :catchall_1
    move-exception v1

    .line 84
    invoke-static {v0}, Lcom/libala/smapi/LogExportHelper;->access$500(Lcom/libala/smapi/LogExportHelper$OutputTarget;)V

    .line 85
    iget-object v0, p0, Lcom/libala/smapi/LogExportHelper$2;->val$activity:Landroid/app/Activity;

    new-instance v2, Lcom/libala/smapi/LogExportHelper$2$2;

    invoke-direct {v2, p0, v1}, Lcom/libala/smapi/LogExportHelper$2$2;-><init>(Lcom/libala/smapi/LogExportHelper$2;Ljava/lang/Throwable;)V

    invoke-static {v0, v2}, Lcom/libala/smapi/LogExportHelper;->access$400(Landroid/app/Activity;Ljava/lang/Runnable;)V

    .line 96
    :goto_0
    return-void
.end method
