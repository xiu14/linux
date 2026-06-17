.class public final Ldev/jahir/blueprint/data/models/IconsCategory$special$$inlined$createParcel$1;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldev/jahir/blueprint/data/models/IconsCategory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Ldev/jahir/blueprint/data/models/IconsCategory;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Landroid/os/Parcelable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            ")",
            "Ldev/jahir/blueprint/data/models/IconsCategory;"
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Ldev/jahir/blueprint/data/models/IconsCategory;

    invoke-direct {v0, p1}, Ldev/jahir/blueprint/data/models/IconsCategory;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ldev/jahir/blueprint/data/models/IconsCategory$special$$inlined$createParcel$1;->createFromParcel(Landroid/os/Parcel;)Landroid/os/Parcelable;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Landroid/os/Parcelable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)[",
            "Ldev/jahir/blueprint/data/models/IconsCategory;"
        }
    .end annotation

    .line 2
    new-array p1, p1, [Ldev/jahir/blueprint/data/models/IconsCategory;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ldev/jahir/blueprint/data/models/IconsCategory$special$$inlined$createParcel$1;->newArray(I)[Landroid/os/Parcelable;

    move-result-object p1

    return-object p1
.end method
