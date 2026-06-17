.class public final Lcom/github/javiersantos/piracychecker/utils/LibraryUtilsKt;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# direct methods
.method public static final a(Landroidx/fragment/app/q0;Ljava/lang/String;Ljava/lang/String;)Landroidx/appcompat/app/r;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance v0, Lp3/z;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lp3/z;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, Lp3/z;->i:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Landroidx/appcompat/app/n;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    iput-boolean v2, v1, Landroidx/appcompat/app/n;->m:Z

    .line 20
    .line 21
    iput-object p1, v1, Landroidx/appcompat/app/n;->d:Ljava/lang/CharSequence;

    .line 22
    .line 23
    iput-object p2, v1, Landroidx/appcompat/app/n;->f:Ljava/lang/CharSequence;

    .line 24
    .line 25
    sget p1, Lcom/github/javiersantos/piracychecker/R$string;->app_unlicensed_close:I

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance p2, Lcom/github/javiersantos/piracychecker/utils/LibraryUtilsKt$buildUnlicensedDialog$$inlined$let$lambda$1;

    .line 32
    .line 33
    invoke-direct {p2, p0}, Lcom/github/javiersantos/piracychecker/utils/LibraryUtilsKt$buildUnlicensedDialog$$inlined$let$lambda$1;-><init>(Landroidx/fragment/app/q0;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p1, p2}, Lp3/z;->h(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lp3/z;->d()Landroidx/appcompat/app/r;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
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
