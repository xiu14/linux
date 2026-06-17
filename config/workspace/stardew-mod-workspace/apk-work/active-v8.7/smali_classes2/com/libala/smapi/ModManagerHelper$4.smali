.class Lcom/libala/smapi/ModManagerHelper$4;
.super Ljava/lang/Object;
.source "ModManagerHelper.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/libala/smapi/ModManagerHelper;->addModRow(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/io/File;Ljava/util/Properties;Lcom/libala/smapi/ModManagerHelper$ModEntry;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$activity:Landroid/app/Activity;

.field final synthetic val$aliases:Ljava/util/Properties;

.field final synthetic val$mod:Lcom/libala/smapi/ModManagerHelper$ModEntry;

.field final synthetic val$modsDir:Ljava/io/File;


# direct methods
.method constructor <init>(Landroid/app/Activity;Ljava/io/File;Ljava/util/Properties;Lcom/libala/smapi/ModManagerHelper$ModEntry;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 167
    iput-object p1, p0, Lcom/libala/smapi/ModManagerHelper$4;->val$activity:Landroid/app/Activity;

    iput-object p2, p0, Lcom/libala/smapi/ModManagerHelper$4;->val$modsDir:Ljava/io/File;

    iput-object p3, p0, Lcom/libala/smapi/ModManagerHelper$4;->val$aliases:Ljava/util/Properties;

    iput-object p4, p0, Lcom/libala/smapi/ModManagerHelper$4;->val$mod:Lcom/libala/smapi/ModManagerHelper$ModEntry;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 170
    iget-object p1, p0, Lcom/libala/smapi/ModManagerHelper$4;->val$activity:Landroid/app/Activity;

    iget-object v0, p0, Lcom/libala/smapi/ModManagerHelper$4;->val$modsDir:Ljava/io/File;

    iget-object v1, p0, Lcom/libala/smapi/ModManagerHelper$4;->val$aliases:Ljava/util/Properties;

    iget-object v2, p0, Lcom/libala/smapi/ModManagerHelper$4;->val$mod:Lcom/libala/smapi/ModManagerHelper$ModEntry;

    invoke-static {p1, v0, v1, v2}, Lcom/libala/smapi/ModManagerHelper;->access$400(Landroid/app/Activity;Ljava/io/File;Ljava/util/Properties;Lcom/libala/smapi/ModManagerHelper$ModEntry;)V

    .line 171
    return-void
.end method
