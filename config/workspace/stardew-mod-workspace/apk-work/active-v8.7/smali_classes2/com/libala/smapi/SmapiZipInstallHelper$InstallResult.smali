.class final Lcom/libala/smapi/SmapiZipInstallHelper$InstallResult;
.super Ljava/lang/Object;
.source "SmapiZipInstallHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/libala/smapi/SmapiZipInstallHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "InstallResult"
.end annotation


# instance fields
.field final files:I

.field final name:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 255
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 256
    iput-object p1, p0, Lcom/libala/smapi/SmapiZipInstallHelper$InstallResult;->name:Ljava/lang/String;

    .line 257
    iput p2, p0, Lcom/libala/smapi/SmapiZipInstallHelper$InstallResult;->files:I

    .line 258
    return-void
.end method
