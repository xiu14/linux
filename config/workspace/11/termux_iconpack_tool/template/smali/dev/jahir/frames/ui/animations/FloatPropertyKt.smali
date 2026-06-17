.class public final Ldev/jahir/frames/ui/animations/FloatPropertyKt;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# direct methods
.method public static final createFloatProperty(Ldev/jahir/frames/ui/animations/FloatProp;)Landroid/util/Property;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ldev/jahir/frames/ui/animations/FloatProp<",
            "TT;>;)",
            "Landroid/util/Property<",
            "TT;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "impl"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x18

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ldev/jahir/frames/ui/animations/FloatProp;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Ldev/jahir/frames/ui/animations/FloatPropertyKt$createFloatProperty$1;

    .line 17
    .line 18
    invoke-direct {v1, p0, v0}, Ldev/jahir/frames/ui/animations/FloatPropertyKt$createFloatProperty$1;-><init>(Ldev/jahir/frames/ui/animations/FloatProp;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :cond_0
    invoke-virtual {p0}, Ldev/jahir/frames/ui/animations/FloatProp;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Ldev/jahir/frames/ui/animations/FloatPropertyKt$createFloatProperty$2;

    .line 27
    .line 28
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 29
    .line 30
    invoke-direct {v1, p0, v2, v0}, Ldev/jahir/frames/ui/animations/FloatPropertyKt$createFloatProperty$2;-><init>(Ldev/jahir/frames/ui/animations/FloatProp;Ljava/lang/Class;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object v1
    .line 34
    .line 35
    .line 36
    .line 37
.end method
