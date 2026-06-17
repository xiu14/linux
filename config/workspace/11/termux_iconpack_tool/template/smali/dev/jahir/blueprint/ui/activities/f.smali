.class public final synthetic Ldev/jahir/blueprint/ui/activities/f;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ld5/l;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Z

.field public final synthetic j:Ld5/l;


# direct methods
.method public synthetic constructor <init>(Ld5/l;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Ldev/jahir/blueprint/ui/activities/f;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldev/jahir/blueprint/ui/activities/f;->j:Ld5/l;

    iput-boolean p2, p0, Ldev/jahir/blueprint/ui/activities/f;->i:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLd5/l;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Ldev/jahir/blueprint/ui/activities/f;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ldev/jahir/blueprint/ui/activities/f;->i:Z

    iput-object p2, p0, Ldev/jahir/blueprint/ui/activities/f;->j:Ld5/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ldev/jahir/blueprint/ui/activities/f;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldev/jahir/blueprint/ui/activities/f;->j:Ld5/l;

    .line 7
    .line 8
    check-cast p1, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;

    .line 9
    .line 10
    iget-boolean v1, p0, Ldev/jahir/blueprint/ui/activities/f;->i:Z

    .line 11
    .line 12
    invoke-static {v1, v0, p1}, Ldev/jahir/frames/extensions/views/ImageViewKt;->d(ZLd5/l;Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;)Lp4/k;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :pswitch_0
    iget-boolean v0, p0, Ldev/jahir/blueprint/ui/activities/f;->i:Z

    .line 18
    .line 19
    check-cast p1, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 20
    .line 21
    iget-object v1, p0, Ldev/jahir/blueprint/ui/activities/f;->j:Ld5/l;

    .line 22
    .line 23
    invoke-static {v1, v0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->Z(Ld5/l;ZLcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method
