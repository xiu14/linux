.class Lcom/google/android/material/timepicker/TimePickerView$2;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final synthetic a:Lcom/google/android/material/timepicker/TimePickerView;


# direct methods
.method public constructor <init>(Lcom/google/android/material/timepicker/TimePickerView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/timepicker/TimePickerView$2;->a:Lcom/google/android/material/timepicker/TimePickerView;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    .line 4
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
.method public final onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/google/android/material/timepicker/TimePickerView$2;->a:Lcom/google/android/material/timepicker/TimePickerView;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/google/android/material/timepicker/TimePickerView;->D:Lcom/google/android/material/timepicker/MaterialTimePicker;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput v0, p1, Lcom/google/android/material/timepicker/MaterialTimePicker;->A:I

    .line 9
    .line 10
    iget-object v1, p1, Lcom/google/android/material/timepicker/MaterialTimePicker;->y:Lcom/google/android/material/button/MaterialButton;

    .line 11
    .line 12
    invoke-virtual {p1, v1}, Lcom/google/android/material/timepicker/MaterialTimePicker;->h(Lcom/google/android/material/button/MaterialButton;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p1, Lcom/google/android/material/timepicker/MaterialTimePicker;->o:Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->d()V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    return p1
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
