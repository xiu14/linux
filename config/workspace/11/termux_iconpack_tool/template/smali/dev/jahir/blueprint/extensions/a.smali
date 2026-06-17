.class public final synthetic Ldev/jahir/blueprint/extensions/a;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Z

.field public final synthetic j:Z

.field public final synthetic k:Landroid/view/KeyEvent$Callback;


# direct methods
.method public synthetic constructor <init>(ZLdev/jahir/frames/ui/activities/base/BaseSystemUIVisibilityActivity;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Ldev/jahir/blueprint/extensions/a;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ldev/jahir/blueprint/extensions/a;->i:Z

    iput-object p2, p0, Ldev/jahir/blueprint/extensions/a;->k:Landroid/view/KeyEvent$Callback;

    iput-boolean p3, p0, Ldev/jahir/blueprint/extensions/a;->j:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZLcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Ldev/jahir/blueprint/extensions/a;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ldev/jahir/blueprint/extensions/a;->i:Z

    iput-boolean p2, p0, Ldev/jahir/blueprint/extensions/a;->j:Z

    iput-object p3, p0, Ldev/jahir/blueprint/extensions/a;->k:Landroid/view/KeyEvent$Callback;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Ldev/jahir/blueprint/extensions/a;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldev/jahir/blueprint/extensions/a;->k:Landroid/view/KeyEvent$Callback;

    .line 7
    .line 8
    check-cast v0, Ldev/jahir/frames/ui/activities/base/BaseSystemUIVisibilityActivity;

    .line 9
    .line 10
    iget-boolean v1, p0, Ldev/jahir/blueprint/extensions/a;->j:Z

    .line 11
    .line 12
    iget-boolean v2, p0, Ldev/jahir/blueprint/extensions/a;->i:Z

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Ldev/jahir/frames/ui/activities/base/BaseSystemUIVisibilityActivity;->m(ZLdev/jahir/frames/ui/activities/base/BaseSystemUIVisibilityActivity;Z)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Ldev/jahir/blueprint/extensions/a;->k:Landroid/view/KeyEvent$Callback;

    .line 19
    .line 20
    check-cast v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 21
    .line 22
    iget-boolean v1, p0, Ldev/jahir/blueprint/extensions/a;->i:Z

    .line 23
    .line 24
    iget-boolean v2, p0, Ldev/jahir/blueprint/extensions/a;->j:Z

    .line 25
    .line 26
    invoke-static {v1, v2, v0}, Ldev/jahir/blueprint/extensions/ExtendedFloatingActionButtonKt;->a(ZZLcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 32
    .line 33
.end method
