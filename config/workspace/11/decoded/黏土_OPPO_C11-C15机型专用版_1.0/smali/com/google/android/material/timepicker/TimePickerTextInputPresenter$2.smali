.class Lcom/google/android/material/timepicker/TimePickerTextInputPresenter$2;
.super Lcom/google/android/material/internal/TextWatcherAdapter;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;


# direct methods
.method public constructor <init>(Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter$2;->h:Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/material/internal/TextWatcherAdapter;-><init>()V

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
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    iget-object v1, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter$2;->h:Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_1
    iget-object p1, v1, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->i:Lcom/google/android/material/timepicker/TimeModel;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p1, v0}, Lcom/google/android/material/timepicker/TimeModel;->d(I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iget-object v0, v1, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->i:Lcom/google/android/material/timepicker/TimeModel;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lcom/google/android/material/timepicker/TimeModel;->d(I)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 27
    .line 28
    .line 29
    :catch_0
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method
