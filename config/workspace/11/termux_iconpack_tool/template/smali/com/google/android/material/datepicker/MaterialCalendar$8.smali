.class Lcom/google/android/material/datepicker/MaterialCalendar$8;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic h:Lcom/google/android/material/datepicker/MaterialCalendar;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/MaterialCalendar;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar$8;->h:Lcom/google/android/material/datepicker/MaterialCalendar;

    .line 5
    .line 6
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar$8;->h:Lcom/google/android/material/datepicker/MaterialCalendar;

    .line 2
    .line 3
    iget-object v0, p1, Lcom/google/android/material/datepicker/MaterialCalendar;->n:Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;

    .line 4
    .line 5
    sget-object v1, Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;->h:Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;

    .line 6
    .line 7
    sget-object v2, Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;->i:Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;

    .line 8
    .line 9
    if-ne v0, v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Lcom/google/android/material/datepicker/MaterialCalendar;->i(Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1, v2}, Lcom/google/android/material/datepicker/MaterialCalendar;->i(Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
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
.end method
