.class final Lcom/libala/smapi/ModManagerHelper$ModEntry;
.super Ljava/lang/Object;
.source "ModManagerHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/libala/smapi/ModManagerHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "ModEntry"
.end annotation


# instance fields
.field final displayName:Ljava/lang/String;

.field final enabled:Z

.field final folder:Ljava/io/File;

.field final originalName:Ljava/lang/String;

.field final version:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 386
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 387
    iput-object p1, p0, Lcom/libala/smapi/ModManagerHelper$ModEntry;->folder:Ljava/io/File;

    .line 388
    iput-object p2, p0, Lcom/libala/smapi/ModManagerHelper$ModEntry;->originalName:Ljava/lang/String;

    .line 389
    iput-object p3, p0, Lcom/libala/smapi/ModManagerHelper$ModEntry;->displayName:Ljava/lang/String;

    .line 390
    iput-object p4, p0, Lcom/libala/smapi/ModManagerHelper$ModEntry;->version:Ljava/lang/String;

    .line 391
    iput-boolean p5, p0, Lcom/libala/smapi/ModManagerHelper$ModEntry;->enabled:Z

    .line 392
    return-void
.end method
