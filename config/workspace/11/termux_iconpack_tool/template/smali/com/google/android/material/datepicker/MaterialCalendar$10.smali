.class Lcom/google/android/material/datepicker/MaterialCalendar$10;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic h:Lcom/google/android/material/datepicker/MonthsPagerAdapter;

.field public final synthetic i:Lcom/google/android/material/datepicker/MaterialCalendar;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/MaterialCalendar;Lcom/google/android/material/datepicker/MonthsPagerAdapter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar$10;->i:Lcom/google/android/material/datepicker/MaterialCalendar;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/material/datepicker/MaterialCalendar$10;->h:Lcom/google/android/material/datepicker/MonthsPagerAdapter;

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
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar$10;->i:Lcom/google/android/material/datepicker/MaterialCalendar;

    .line 2
    .line 3
    iget-object v0, p1, Lcom/google/android/material/datepicker/MaterialCalendar;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/p1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    add-int/lit8 v0, v0, -0x1

    .line 16
    .line 17
    if-ltz v0, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Lcom/google/android/material/datepicker/MaterialCalendar$10;->h:Lcom/google/android/material/datepicker/MonthsPagerAdapter;

    .line 20
    .line 21
    iget-object v1, v1, Lcom/google/android/material/datepicker/MonthsPagerAdapter;->a:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 22
    .line 23
    iget-object v1, v1, Lcom/google/android/material/datepicker/CalendarConstraints;->h:Lcom/google/android/material/datepicker/Month;

    .line 24
    .line 25
    iget-object v1, v1, Lcom/google/android/material/datepicker/Month;->h:Ljava/util/Calendar;

    .line 26
    .line 27
    invoke-static {v1}, Lcom/google/android/material/datepicker/UtcDates;->d(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/4 v2, 0x2

    .line 32
    invoke-virtual {v1, v2, v0}, Ljava/util/Calendar;->add(II)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Lcom/google/android/material/datepicker/Month;

    .line 36
    .line 37
    invoke-direct {v0, v1}, Lcom/google/android/material/datepicker/Month;-><init>(Ljava/util/Calendar;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/MaterialCalendar;->h(Lcom/google/android/material/datepicker/Month;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method
