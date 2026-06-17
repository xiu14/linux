.class Lcom/libala/smapi/ModManagerHelper$10;
.super Ljava/lang/Object;
.source "ModManagerHelper.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/libala/smapi/ModManagerHelper;->showDeleteDialog(Landroid/app/Activity;Ljava/io/File;Ljava/util/Properties;Lcom/libala/smapi/ModManagerHelper$ModEntry;)V
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

    iput-object p1, p0, Lcom/libala/smapi/ModManagerHelper$10;->val$activity:Landroid/app/Activity;

    iput-object p2, p0, Lcom/libala/smapi/ModManagerHelper$10;->val$modsDir:Ljava/io/File;

    iput-object p3, p0, Lcom/libala/smapi/ModManagerHelper$10;->val$aliases:Ljava/util/Properties;

    iput-object p4, p0, Lcom/libala/smapi/ModManagerHelper$10;->val$mod:Lcom/libala/smapi/ModManagerHelper$ModEntry;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    :try_start_0
    iget-object p1, p0, Lcom/libala/smapi/ModManagerHelper$10;->val$mod:Lcom/libala/smapi/ModManagerHelper$ModEntry;

    iget-object p1, p1, Lcom/libala/smapi/ModManagerHelper$ModEntry;->folder:Ljava/io/File;

    invoke-static {p1}, Lcom/libala/smapi/ModManagerHelper;->access$700(Ljava/io/File;)V

    iget-object p1, p0, Lcom/libala/smapi/ModManagerHelper$10;->val$aliases:Ljava/util/Properties;

    iget-object v0, p0, Lcom/libala/smapi/ModManagerHelper$10;->val$mod:Lcom/libala/smapi/ModManagerHelper$ModEntry;

    iget-object v0, v0, Lcom/libala/smapi/ModManagerHelper$ModEntry;->folder:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/Properties;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/libala/smapi/ModManagerHelper$10;->val$modsDir:Ljava/io/File;

    iget-object v0, p0, Lcom/libala/smapi/ModManagerHelper$10;->val$aliases:Ljava/util/Properties;

    invoke-static {p1, v0}, Lcom/libala/smapi/ModManagerHelper;->access$500(Ljava/io/File;Ljava/util/Properties;)V

    iget-object p1, p0, Lcom/libala/smapi/ModManagerHelper$10;->val$activity:Landroid/app/Activity;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u5df2\u5220\u9664 MOD\uff1a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/libala/smapi/ModManagerHelper$10;->val$mod:Lcom/libala/smapi/ModManagerHelper$ModEntry;

    iget-object v1, v1, Lcom/libala/smapi/ModManagerHelper$ModEntry;->displayName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/libala/smapi/ModManagerHelper;->access$200(Landroid/app/Activity;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/libala/smapi/ModManagerHelper$10;->val$activity:Landroid/app/Activity;

    invoke-static {p1}, Lcom/libala/smapi/ModManagerHelper;->access$000(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/libala/smapi/ModManagerHelper$10;->val$activity:Landroid/app/Activity;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u5220\u9664\u5931\u8d25\uff1a"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/libala/smapi/ModManagerHelper;->access$200(Landroid/app/Activity;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
