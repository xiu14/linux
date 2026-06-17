.class Lcom/google/android/material/timepicker/TimePickerTextInputKeyController;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final h:Lcom/google/android/material/timepicker/ChipTextInputComboView;

.field public final i:Lcom/google/android/material/timepicker/ChipTextInputComboView;

.field public final j:Lcom/google/android/material/timepicker/TimeModel;

.field public k:Z


# direct methods
.method public constructor <init>(Lcom/google/android/material/timepicker/ChipTextInputComboView;Lcom/google/android/material/timepicker/ChipTextInputComboView;Lcom/google/android/material/timepicker/TimeModel;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/google/android/material/timepicker/TimePickerTextInputKeyController;->k:Z

    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/android/material/timepicker/TimePickerTextInputKeyController;->h:Lcom/google/android/material/timepicker/ChipTextInputComboView;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/google/android/material/timepicker/TimePickerTextInputKeyController;->i:Lcom/google/android/material/timepicker/ChipTextInputComboView;

    .line 10
    .line 11
    iput-object p3, p0, Lcom/google/android/material/timepicker/TimePickerTextInputKeyController;->j:Lcom/google/android/material/timepicker/TimeModel;

    .line 12
    .line 13
    return-void
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
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method


# virtual methods
.method public final a(I)V
    .locals 4

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    iget-object v3, p0, Lcom/google/android/material/timepicker/TimePickerTextInputKeyController;->i:Lcom/google/android/material/timepicker/ChipTextInputComboView;

    .line 11
    .line 12
    invoke-virtual {v3, v0}, Lcom/google/android/material/timepicker/ChipTextInputComboView;->setChecked(Z)V

    .line 13
    .line 14
    .line 15
    const/16 v0, 0xa

    .line 16
    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerTextInputKeyController;->h:Lcom/google/android/material/timepicker/ChipTextInputComboView;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/google/android/material/timepicker/ChipTextInputComboView;->setChecked(Z)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerTextInputKeyController;->j:Lcom/google/android/material/timepicker/TimeModel;

    .line 26
    .line 27
    iput p1, v0, Lcom/google/android/material/timepicker/TimeModel;->m:I

    .line 28
    .line 29
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

.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    const/4 p1, 0x5

    .line 2
    if-ne p2, p1, :cond_0

    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 p1, 0x0

    .line 7
    :goto_0
    if-eqz p1, :cond_1

    .line 8
    .line 9
    const/16 p2, 0xc

    .line 10
    .line 11
    invoke-virtual {p0, p2}, Lcom/google/android/material/timepicker/TimePickerTextInputKeyController;->a(I)V

    .line 12
    .line 13
    .line 14
    :cond_1
    return p1
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
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/timepicker/TimePickerTextInputKeyController;->k:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/google/android/material/timepicker/TimePickerTextInputKeyController;->k:Z

    .line 9
    .line 10
    check-cast p1, Landroid/widget/EditText;

    .line 11
    .line 12
    iget-object v2, p0, Lcom/google/android/material/timepicker/TimePickerTextInputKeyController;->j:Lcom/google/android/material/timepicker/TimeModel;

    .line 13
    .line 14
    iget v2, v2, Lcom/google/android/material/timepicker/TimeModel;->m:I

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    const/16 v4, 0xc

    .line 18
    .line 19
    if-ne v2, v4, :cond_3

    .line 20
    .line 21
    const/16 v2, 0x43

    .line 22
    .line 23
    if-ne p2, v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-nez p2, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    const/16 p1, 0xa

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lcom/google/android/material/timepicker/TimePickerTextInputKeyController;->a(I)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionStart()I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-nez p2, :cond_2

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/widget/TextView;->length()I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-ne p2, v3, :cond_2

    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-interface {p1}, Landroid/text/Editable;->clear()V

    .line 64
    .line 65
    .line 66
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    if-nez v2, :cond_4

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    const/4 v5, 0x7

    .line 76
    if-lt p2, v5, :cond_5

    .line 77
    .line 78
    const/16 v5, 0x10

    .line 79
    .line 80
    if-gt p2, v5, :cond_5

    .line 81
    .line 82
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    if-ne p2, v0, :cond_5

    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionStart()I

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    if-ne p2, v3, :cond_5

    .line 93
    .line 94
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    if-ne p2, v3, :cond_5

    .line 99
    .line 100
    invoke-virtual {p0, v4}, Lcom/google/android/material/timepicker/TimePickerTextInputKeyController;->a(I)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_5
    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionStart()I

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    if-nez p2, :cond_2

    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/widget/TextView;->length()I

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    if-ne p2, v3, :cond_2

    .line 115
    .line 116
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-interface {p1}, Landroid/text/Editable;->clear()V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :goto_1
    iput-boolean v1, p0, Lcom/google/android/material/timepicker/TimePickerTextInputKeyController;->k:Z

    .line 125
    .line 126
    return v0
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
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method
