.class public final Landroidx/fragment/app/t1;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public a:I

.field public b:Landroidx/fragment/app/l0;

.field public c:Z

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Landroidx/lifecycle/o;

.field public i:Landroidx/lifecycle/o;


# direct methods
.method public constructor <init>(ILandroidx/fragment/app/l0;I)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput p1, p0, Landroidx/fragment/app/t1;->a:I

    .line 9
    iput-object p2, p0, Landroidx/fragment/app/t1;->b:Landroidx/fragment/app/l0;

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Landroidx/fragment/app/t1;->c:Z

    .line 11
    sget-object p1, Landroidx/lifecycle/o;->l:Landroidx/lifecycle/o;

    iput-object p1, p0, Landroidx/fragment/app/t1;->h:Landroidx/lifecycle/o;

    .line 12
    iput-object p1, p0, Landroidx/fragment/app/t1;->i:Landroidx/lifecycle/o;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/l0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p2, p0, Landroidx/fragment/app/t1;->a:I

    .line 3
    iput-object p1, p0, Landroidx/fragment/app/t1;->b:Landroidx/fragment/app/l0;

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Landroidx/fragment/app/t1;->c:Z

    .line 5
    sget-object p1, Landroidx/lifecycle/o;->l:Landroidx/lifecycle/o;

    iput-object p1, p0, Landroidx/fragment/app/t1;->h:Landroidx/lifecycle/o;

    .line 6
    iput-object p1, p0, Landroidx/fragment/app/t1;->i:Landroidx/lifecycle/o;

    return-void
.end method
