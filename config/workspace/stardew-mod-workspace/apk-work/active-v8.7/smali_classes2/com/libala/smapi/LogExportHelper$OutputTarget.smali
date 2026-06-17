.class final Lcom/libala/smapi/LogExportHelper$OutputTarget;
.super Ljava/lang/Object;
.source "LogExportHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/libala/smapi/LogExportHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "OutputTarget"
.end annotation


# instance fields
.field final displayPath:Ljava/lang/String;

.field final output:Ljava/io/OutputStream;

.field final uri:Landroid/net/Uri;


# direct methods
.method constructor <init>(Ljava/io/OutputStream;Landroid/net/Uri;Ljava/lang/String;)V
    .locals 0

    .line 333
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 334
    iput-object p1, p0, Lcom/libala/smapi/LogExportHelper$OutputTarget;->output:Ljava/io/OutputStream;

    .line 335
    iput-object p2, p0, Lcom/libala/smapi/LogExportHelper$OutputTarget;->uri:Landroid/net/Uri;

    .line 336
    iput-object p3, p0, Lcom/libala/smapi/LogExportHelper$OutputTarget;->displayPath:Ljava/lang/String;

    .line 337
    return-void
.end method
