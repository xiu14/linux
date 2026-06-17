.class public Lcom/google/android/material/datepicker/MonthsPagerAdapter$ViewHolder;
.super Landroidx/recyclerview/widget/i2;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/datepicker/MonthsPagerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ViewHolder"
.end annotation


# instance fields
.field public final a:Landroid/widget/TextView;

.field public final b:Lcom/google/android/material/datepicker/MaterialCalendarGridView;


# direct methods
.method public constructor <init>(Landroid/widget/LinearLayout;Z)V
    .locals 8

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/i2;-><init>(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    sget v0, Lcom/google/android/material/R$id;->month_title:I

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/widget/TextView;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/google/android/material/datepicker/MonthsPagerAdapter$ViewHolder;->a:Landroid/widget/TextView;

    .line 13
    .line 14
    sget-object v1, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 15
    .line 16
    new-instance v2, Lm0/g0;

    .line 17
    .line 18
    sget v3, La0/b;->tag_accessibility_heading:I

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v7, 0x3

    .line 22
    const-class v4, Ljava/lang/Boolean;

    .line 23
    .line 24
    const/16 v6, 0x1c

    .line 25
    .line 26
    invoke-direct/range {v2 .. v7}, Lm0/g0;-><init>(ILjava/lang/Class;III)V

    .line 27
    .line 28
    .line 29
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {v2, v0, v1}, Lb1/c;->f(Landroid/view/View;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget v1, Lcom/google/android/material/R$id;->month_grid:I

    .line 35
    .line 36
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    .line 41
    .line 42
    iput-object p1, p0, Lcom/google/android/material/datepicker/MonthsPagerAdapter$ViewHolder;->b:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    .line 43
    .line 44
    if-nez p2, :cond_0

    .line 45
    .line 46
    const/16 p1, 0x8

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void
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
