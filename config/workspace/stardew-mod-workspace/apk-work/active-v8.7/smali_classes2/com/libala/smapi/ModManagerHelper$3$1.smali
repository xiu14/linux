.class Lcom/libala/smapi/ModManagerHelper$3$1;
.super Ljava/lang/Object;
.source "ModManagerHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/libala/smapi/ModManagerHelper$3;->onCheckedChanged(Landroid/widget/CompoundButton;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/libala/smapi/ModManagerHelper$3;


# direct methods
.method constructor <init>(Lcom/libala/smapi/ModManagerHelper$3;)V
    .locals 0

    .line 140
    iput-object p1, p0, Lcom/libala/smapi/ModManagerHelper$3$1;->this$0:Lcom/libala/smapi/ModManagerHelper$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/libala/smapi/ModManagerHelper$3$1;->this$0:Lcom/libala/smapi/ModManagerHelper$3;

    iget-object v0, v0, Lcom/libala/smapi/ModManagerHelper$3;->val$activity:Landroid/app/Activity;

    invoke-static {v0}, Lcom/libala/smapi/ModManagerHelper;->access$000(Landroid/app/Activity;)V

    .line 144
    return-void
.end method
