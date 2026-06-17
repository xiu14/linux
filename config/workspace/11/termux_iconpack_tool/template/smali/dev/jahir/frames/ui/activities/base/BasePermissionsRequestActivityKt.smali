.class public final Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivityKt;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# direct methods
.method public static final getPermissionsResult(Ljava/util/List;)Ldev/jahir/frames/ui/activities/base/PermissionsResult;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lt3/f;",
            ">;)",
            "Ldev/jahir/frames/ui/activities/base/PermissionsResult;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    move-object v3, v1

    .line 22
    check-cast v3, Lt3/f;

    .line 23
    .line 24
    invoke-virtual {v3}, Lt3/f;->a()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const-string v4, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 29
    .line 30
    if-ne v3, v4, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-object v1, v2

    .line 34
    :goto_0
    const/4 v0, 0x0

    .line 35
    const/4 v3, 0x1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const/4 v1, 0x0

    .line 41
    :goto_1
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 42
    .line 43
    const/16 v5, 0x21

    .line 44
    .line 45
    if-lt v4, v5, :cond_5

    .line 46
    .line 47
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_4

    .line 56
    .line 57
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    move-object v5, v4

    .line 62
    check-cast v5, Lt3/f;

    .line 63
    .line 64
    invoke-virtual {v5}, Lt3/f;->a()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    const-string v6, "android.permission.POST_NOTIFICATIONS"

    .line 69
    .line 70
    if-ne v5, v6, :cond_3

    .line 71
    .line 72
    move-object v2, v4

    .line 73
    :cond_4
    if-eqz v2, :cond_6

    .line 74
    .line 75
    :cond_5
    const/4 v0, 0x1

    .line 76
    :cond_6
    new-instance p0, Ldev/jahir/frames/ui/activities/base/PermissionsResult;

    .line 77
    .line 78
    invoke-direct {p0, v1, v0}, Ldev/jahir/frames/ui/activities/base/PermissionsResult;-><init>(ZZ)V

    .line 79
    .line 80
    .line 81
    return-object p0
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
