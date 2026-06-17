.class public Landroidx/preference/DropDownPreference;
.super Landroidx/preference/ListPreference;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final f0:Landroid/widget/ArrayAdapter;

.field public g0:Landroid/widget/Spinner;

.field public final h0:Landroidx/preference/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 1
    sget v0, Landroidx/preference/e0;->dropdownPreferenceStyle:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, p1, p2, v0, v1}, Landroidx/preference/ListPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 5
    .line 6
    .line 7
    new-instance p2, Landroidx/preference/b;

    .line 8
    .line 9
    invoke-direct {p2, p0}, Landroidx/preference/b;-><init>(Landroidx/preference/DropDownPreference;)V

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Landroidx/preference/DropDownPreference;->h0:Landroidx/preference/b;

    .line 13
    .line 14
    new-instance p2, Landroid/widget/ArrayAdapter;

    .line 15
    .line 16
    const v0, 0x1090009

    .line 17
    .line 18
    .line 19
    invoke-direct {p2, p1, v0}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, Landroidx/preference/DropDownPreference;->f0:Landroid/widget/ArrayAdapter;

    .line 23
    .line 24
    invoke-virtual {p2}, Landroid/widget/ArrayAdapter;->clear()V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Landroidx/preference/ListPreference;->a0:[Ljava/lang/CharSequence;

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    array-length v0, p1

    .line 32
    :goto_0
    if-ge v1, v0, :cond_0

    .line 33
    .line 34
    aget-object v2, p1, v1

    .line 35
    .line 36
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {p2, v2}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    return-void
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
.method public final k()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/preference/Preference;->k()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/preference/DropDownPreference;->f0:Landroid/widget/ArrayAdapter;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
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

.method public final o(Landroidx/preference/d0;)V
    .locals 5

    .line 1
    iget-object v0, p1, Landroidx/recyclerview/widget/i2;->itemView:Landroid/view/View;

    .line 2
    .line 3
    sget v1, Landroidx/preference/g0;->spinner:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/widget/Spinner;

    .line 10
    .line 11
    iput-object v0, p0, Landroidx/preference/DropDownPreference;->g0:Landroid/widget/Spinner;

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/preference/DropDownPreference;->f0:Landroid/widget/ArrayAdapter;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Landroidx/preference/DropDownPreference;->g0:Landroid/widget/Spinner;

    .line 19
    .line 20
    iget-object v1, p0, Landroidx/preference/DropDownPreference;->h0:Landroidx/preference/b;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Landroidx/preference/DropDownPreference;->g0:Landroid/widget/Spinner;

    .line 26
    .line 27
    iget-object v1, p0, Landroidx/preference/ListPreference;->c0:Ljava/lang/String;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object v2, p0, Landroidx/preference/ListPreference;->b0:[Ljava/lang/CharSequence;

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    array-length v3, v2

    .line 36
    add-int/lit8 v3, v3, -0x1

    .line 37
    .line 38
    :goto_0
    if-ltz v3, :cond_1

    .line 39
    .line 40
    aget-object v4, v2, v3

    .line 41
    .line 42
    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-static {v4, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_0

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    add-int/lit8 v3, v3, -0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    const/4 v3, -0x1

    .line 57
    :goto_1
    invoke-virtual {v0, v3}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 58
    .line 59
    .line 60
    invoke-super {p0, p1}, Landroidx/preference/Preference;->o(Landroidx/preference/d0;)V

    .line 61
    .line 62
    .line 63
    return-void
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

.method public final p()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/preference/DropDownPreference;->g0:Landroid/widget/Spinner;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/Spinner;->performClick()Z

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
.end method
