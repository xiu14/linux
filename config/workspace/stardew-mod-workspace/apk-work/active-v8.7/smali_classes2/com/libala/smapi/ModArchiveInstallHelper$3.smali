.class Lcom/libala/smapi/ModArchiveInstallHelper$3;
.super Ljava/lang/Object;
.source "ModArchiveInstallHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/libala/smapi/ModArchiveInstallHelper;->installInBackground(Landroid/app/Activity;Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$activity:Landroid/app/Activity;

.field final synthetic val$uris:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Ljava/util/ArrayList;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 170
    iput-object p1, p0, Lcom/libala/smapi/ModArchiveInstallHelper$3;->val$uris:Ljava/util/ArrayList;

    iput-object p2, p0, Lcom/libala/smapi/ModArchiveInstallHelper$3;->val$activity:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 173
    const-string v0, "\uff1a"

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 174
    nop

    .line 175
    iget-object v2, p0, Lcom/libala/smapi/ModArchiveInstallHelper$3;->val$uris:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/net/Uri;

    .line 176
    iget-object v5, p0, Lcom/libala/smapi/ModArchiveInstallHelper$3;->val$activity:Landroid/app/Activity;

    invoke-static {v5, v4}, Lcom/libala/smapi/ModArchiveInstallHelper;->access$100(Landroid/app/Activity;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v5

    .line 178
    :try_start_0
    iget-object v6, p0, Lcom/libala/smapi/ModArchiveInstallHelper$3;->val$activity:Landroid/app/Activity;

    invoke-static {v6, v4, v5}, Lcom/libala/smapi/ModArchiveInstallHelper;->access$200(Landroid/app/Activity;Landroid/net/Uri;Ljava/lang/String;)I

    move-result v4

    .line 179
    add-int/2addr v3, v4

    .line 180
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\u6210\u529f "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v6, " \u4e2a MOD"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 183
    goto :goto_1

    .line 181
    :catchall_0
    move-exception v4

    .line 182
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\u5931\u8d25 "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v4}, Lcom/libala/smapi/ModArchiveInstallHelper;->access$300(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    :goto_1
    goto :goto_0

    .line 186
    :cond_0
    if-lez v3, :cond_1

    const-string v0, "MOD \u5b89\u88c5\u5b8c\u6210"

    goto :goto_2

    :cond_1
    const-string v0, "MOD \u5b89\u88c5\u5931\u8d25"

    .line 187
    :goto_2
    invoke-static {v1}, Lcom/libala/smapi/ModArchiveInstallHelper;->access$400(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    .line 188
    iget-object v2, p0, Lcom/libala/smapi/ModArchiveInstallHelper$3;->val$activity:Landroid/app/Activity;

    new-instance v3, Lcom/libala/smapi/ModArchiveInstallHelper$3$1;

    invoke-direct {v3, p0, v0, v1}, Lcom/libala/smapi/ModArchiveInstallHelper$3$1;-><init>(Lcom/libala/smapi/ModArchiveInstallHelper$3;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2, v3}, Lcom/libala/smapi/ModArchiveInstallHelper;->access$500(Landroid/app/Activity;Ljava/lang/Runnable;)V

    .line 198
    return-void
.end method
