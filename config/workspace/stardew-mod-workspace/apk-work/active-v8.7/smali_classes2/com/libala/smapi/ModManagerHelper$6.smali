.class Lcom/libala/smapi/ModManagerHelper$6;
.super Ljava/lang/Object;
.source "ModManagerHelper.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/libala/smapi/ModManagerHelper;->showRenameDialog(Landroid/app/Activity;Ljava/io/File;Ljava/util/Properties;Lcom/libala/smapi/ModManagerHelper$ModEntry;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$activity:Landroid/app/Activity;

.field final synthetic val$aliases:Ljava/util/Properties;

.field final synthetic val$input:Landroid/widget/EditText;

.field final synthetic val$mod:Lcom/libala/smapi/ModManagerHelper$ModEntry;

.field final synthetic val$modsDir:Ljava/io/File;


# direct methods
.method constructor <init>(Landroid/widget/EditText;Lcom/libala/smapi/ModManagerHelper$ModEntry;Ljava/util/Properties;Ljava/io/File;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 224
    iput-object p1, p0, Lcom/libala/smapi/ModManagerHelper$6;->val$input:Landroid/widget/EditText;

    iput-object p2, p0, Lcom/libala/smapi/ModManagerHelper$6;->val$mod:Lcom/libala/smapi/ModManagerHelper$ModEntry;

    iput-object p3, p0, Lcom/libala/smapi/ModManagerHelper$6;->val$aliases:Ljava/util/Properties;

    iput-object p4, p0, Lcom/libala/smapi/ModManagerHelper$6;->val$modsDir:Ljava/io/File;

    iput-object p5, p0, Lcom/libala/smapi/ModManagerHelper$6;->val$activity:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 228
    :try_start_0
    iget-object p1, p0, Lcom/libala/smapi/ModManagerHelper$6;->val$input:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 229
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/libala/smapi/ModManagerHelper$6;->val$mod:Lcom/libala/smapi/ModManagerHelper$ModEntry;

    iget-object p2, p2, Lcom/libala/smapi/ModManagerHelper$ModEntry;->originalName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p2, p0, Lcom/libala/smapi/ModManagerHelper$6;->val$mod:Lcom/libala/smapi/ModManagerHelper$ModEntry;

    iget-object p2, p2, Lcom/libala/smapi/ModManagerHelper$ModEntry;->folder:Ljava/io/File;

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    .line 232
    :cond_0
    iget-object p2, p0, Lcom/libala/smapi/ModManagerHelper$6;->val$aliases:Ljava/util/Properties;

    iget-object v0, p0, Lcom/libala/smapi/ModManagerHelper$6;->val$mod:Lcom/libala/smapi/ModManagerHelper$ModEntry;

    iget-object v0, v0, Lcom/libala/smapi/ModManagerHelper$ModEntry;->folder:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0, p1}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    goto :goto_1

    .line 230
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/libala/smapi/ModManagerHelper$6;->val$aliases:Ljava/util/Properties;

    iget-object p2, p0, Lcom/libala/smapi/ModManagerHelper$6;->val$mod:Lcom/libala/smapi/ModManagerHelper$ModEntry;

    iget-object p2, p2, Lcom/libala/smapi/ModManagerHelper$ModEntry;->folder:Ljava/io/File;

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/Properties;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    :goto_1
    iget-object p1, p0, Lcom/libala/smapi/ModManagerHelper$6;->val$modsDir:Ljava/io/File;

    iget-object p2, p0, Lcom/libala/smapi/ModManagerHelper$6;->val$aliases:Ljava/util/Properties;

    invoke-static {p1, p2}, Lcom/libala/smapi/ModManagerHelper;->access$500(Ljava/io/File;Ljava/util/Properties;)V

    .line 234
    iget-object p1, p0, Lcom/libala/smapi/ModManagerHelper$6;->val$activity:Landroid/app/Activity;

    const-string p2, "\u5df2\u4fdd\u5b58\u663e\u793a\u540d"

    invoke-static {p1, p2}, Lcom/libala/smapi/ModManagerHelper;->access$200(Landroid/app/Activity;Ljava/lang/String;)V

    .line 235
    iget-object p1, p0, Lcom/libala/smapi/ModManagerHelper$6;->val$activity:Landroid/app/Activity;

    invoke-static {p1}, Lcom/libala/smapi/ModManagerHelper;->access$000(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 238
    goto :goto_2

    .line 236
    :catchall_0
    move-exception p1

    .line 237
    iget-object p2, p0, Lcom/libala/smapi/ModManagerHelper$6;->val$activity:Landroid/app/Activity;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u4fdd\u5b58\u5931\u8d25\uff1a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/libala/smapi/ModManagerHelper;->access$200(Landroid/app/Activity;Ljava/lang/String;)V

    .line 239
    :goto_2
    return-void
.end method
