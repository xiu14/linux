.class Lcom/libala/smapi/ModManagerHelper$2;
.super Ljava/lang/Object;
.source "ModManagerHelper.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/libala/smapi/ModManagerHelper;->showManager(Landroid/app/Activity;)V
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

    .line 100
    iput-object p1, p0, Lcom/libala/smapi/ModManagerHelper$2;->val$activity:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 103
    iget-object p1, p0, Lcom/libala/smapi/ModManagerHelper$2;->val$activity:Landroid/app/Activity;

    invoke-static {p1}, Lcom/libala/smapi/ModArchiveInstallHelper;->startInstall(Landroid/app/Activity;)V

    .line 104
    return-void
.end method
