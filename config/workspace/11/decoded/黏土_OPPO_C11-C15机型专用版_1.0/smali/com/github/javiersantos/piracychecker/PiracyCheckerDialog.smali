.class public final Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;
.super Landroidx/fragment/app/y;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog$Companion;
    }
.end annotation


# static fields
.field public static h:Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;

.field public static i:Ljava/lang/String;

.field public static j:Ljava/lang/String;

.field public static final k:Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog$Companion;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;->k:Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog$Companion;

    .line 8
    .line 9
    return-void
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
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/y;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
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
.end method


# virtual methods
.method public final onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/y;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-virtual {p0, p1}, Landroidx/fragment/app/y;->setCancelable(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_2

    .line 13
    .line 14
    sget-object v0, Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;->i:Ljava/lang/String;

    .line 15
    .line 16
    const-string v1, ""

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v0, v1

    .line 22
    :goto_0
    sget-object v2, Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;->j:Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    move-object v1, v2

    .line 27
    :cond_1
    invoke-static {p1, v0, v1}, Lcom/github/javiersantos/piracychecker/utils/LibraryUtilsKt;->a(Landroidx/fragment/app/q0;Ljava/lang/String;Ljava/lang/String;)Landroidx/appcompat/app/r;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    const/4 p1, 0x0

    .line 33
    :goto_1
    invoke-static {p1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-object p1
    .line 37
.end method
