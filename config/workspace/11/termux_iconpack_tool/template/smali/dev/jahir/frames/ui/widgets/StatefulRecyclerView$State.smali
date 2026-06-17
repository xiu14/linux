.class final enum Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;
.super Ljava/lang/Enum;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lw4/a;

.field private static final synthetic $VALUES:[Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;

.field public static final Companion:Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State$Companion;

.field public static final enum EMPTY:Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;

.field public static final enum LOADING:Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;

.field public static final enum NORMAL:Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;


# instance fields
.field private final value:I


# direct methods
.method private static final synthetic $values()[Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;

    .line 3
    .line 4
    sget-object v1, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;->NORMAL:Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;->EMPTY:Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    sget-object v1, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;->LOADING:Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    return-object v0
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

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;

    .line 2
    .line 3
    const-string v1, "NORMAL"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;->NORMAL:Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;

    .line 11
    .line 12
    new-instance v0, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;

    .line 13
    .line 14
    const-string v1, "EMPTY"

    .line 15
    .line 16
    invoke-direct {v0, v1, v3, v2}, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;->EMPTY:Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;

    .line 20
    .line 21
    new-instance v0, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    const/4 v2, -0x1

    .line 25
    const-string v3, "LOADING"

    .line 26
    .line 27
    invoke-direct {v0, v3, v1, v2}, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;->LOADING:Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;

    .line 31
    .line 32
    invoke-static {}, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;->$values()[Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;->$VALUES:[Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;

    .line 37
    .line 38
    invoke-static {v0}, Lq3/a;->B([Ljava/lang/Enum;)Lw4/b;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;->$ENTRIES:Lw4/a;

    .line 43
    .line 44
    new-instance v0, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State$Companion;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {v0, v1}, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;->Companion:Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State$Companion;

    .line 51
    .line 52
    return-void
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
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;->value:I

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

.method public static getEntries()Lw4/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw4/a;"
        }
    .end annotation

    .line 1
    sget-object v0, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;->$ENTRIES:Lw4/a;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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

.method public static valueOf(Ljava/lang/String;)Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;
    .locals 1

    .line 1
    const-class v0, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;

    .line 8
    .line 9
    return-object p0
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

.method public static values()[Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;
    .locals 1

    .line 1
    sget-object v0, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;->$VALUES:[Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;

    .line 8
    .line 9
    return-object v0
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


# virtual methods
.method public final getValue()I
    .locals 1

    .line 1
    iget v0, p0, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView$State;->value:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
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
