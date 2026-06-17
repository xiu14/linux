.class Lcom/libala/smapi/ModManagerHelper$3;
.super Ljava/lang/Object;
.source "ModManagerHelper.java"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


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

.field final synthetic val$mod:Lcom/libala/smapi/ModManagerHelper$ModEntry;


# direct methods
.method constructor <init>(Lcom/libala/smapi/ModManagerHelper$ModEntry;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 133
    iput-object p1, p0, Lcom/libala/smapi/ModManagerHelper$3;->val$mod:Lcom/libala/smapi/ModManagerHelper$ModEntry;

    iput-object p2, p0, Lcom/libala/smapi/ModManagerHelper$3;->val$activity:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    .line 137
    :try_start_0
    iget-object v0, p0, Lcom/libala/smapi/ModManagerHelper$3;->val$mod:Lcom/libala/smapi/ModManagerHelper$ModEntry;

    invoke-static {v0, p2}, Lcom/libala/smapi/ModManagerHelper;->access$100(Lcom/libala/smapi/ModManagerHelper$ModEntry;Z)V

    .line 138
    if-eqz p2, :cond_0

    const-string v0, "\u542f\u7528"

    goto :goto_0

    :cond_0
    const-string v0, "\u505c\u7528"

    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setText(Ljava/lang/CharSequence;)V

    .line 139
    iget-object v0, p0, Lcom/libala/smapi/ModManagerHelper$3;->val$activity:Landroid/app/Activity;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p2, :cond_1

    const-string v2, "\u5df2\u542f\u7528\uff1a"

    goto :goto_1

    :cond_1
    const-string v2, "\u5df2\u505c\u7528\uff1a"

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/libala/smapi/ModManagerHelper$3;->val$mod:Lcom/libala/smapi/ModManagerHelper$ModEntry;

    iget-object v2, v2, Lcom/libala/smapi/ModManagerHelper$ModEntry;->displayName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/libala/smapi/ModManagerHelper;->access$200(Landroid/app/Activity;Ljava/lang/String;)V

    .line 140
    iget-object v0, p0, Lcom/libala/smapi/ModManagerHelper$3;->val$activity:Landroid/app/Activity;

    new-instance v1, Lcom/libala/smapi/ModManagerHelper$3$1;

    invoke-direct {v1, p0}, Lcom/libala/smapi/ModManagerHelper$3$1;-><init>(Lcom/libala/smapi/ModManagerHelper$3;)V

    invoke-static {v0, v1}, Lcom/libala/smapi/ModManagerHelper;->access$300(Landroid/app/Activity;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    goto :goto_2

    .line 146
    :catchall_0
    move-exception v0

    .line 147
    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 148
    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 149
    invoke-virtual {p1, p0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 150
    iget-object p1, p0, Lcom/libala/smapi/ModManagerHelper$3;->val$activity:Landroid/app/Activity;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u5207\u6362\u5931\u8d25\uff1a"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/libala/smapi/ModManagerHelper;->access$200(Landroid/app/Activity;Ljava/lang/String;)V

    .line 152
    :goto_2
    return-void
.end method
