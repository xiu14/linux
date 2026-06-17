.class public final Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity$startLicenseCheck$lambda$6$lambda$5$lambda$4$$inlined$allow$1;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lcom/github/javiersantos/piracychecker/callbacks/AllowCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;->startLicenseCheck(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $force$inlined:Z

.field final synthetic this$0:Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;


# direct methods
.method public constructor <init>(Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity$startLicenseCheck$lambda$6$lambda$5$lambda$4$$inlined$allow$1;->this$0:Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;

    .line 2
    .line 3
    iput-boolean p2, p0, Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity$startLicenseCheck$lambda$6$lambda$5$lambda$4$$inlined$allow$1;->$force$inlined:Z

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method


# virtual methods
.method public allow()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity$startLicenseCheck$lambda$6$lambda$5$lambda$4$$inlined$allow$1;->this$0:Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;

    .line 2
    .line 3
    invoke-static {v0}, Ldev/jahir/frames/extensions/context/ContextKt;->isUpdate(Landroid/content/Context;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-boolean v2, p0, Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity$startLicenseCheck$lambda$6$lambda$5$lambda$4$$inlined$allow$1;->$force$inlined:Z

    .line 8
    .line 9
    invoke-static {v0, v1, v2}, Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;->access$showLicensedSnack(Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;ZZ)V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method
