.class public final enum Lcom/github/junrar/rarfile/SubBlockHeaderType;
.super Ljava/lang/Enum;
.source "SubBlockHeaderType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/github/junrar/rarfile/SubBlockHeaderType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/github/junrar/rarfile/SubBlockHeaderType;

.field public static final enum BEEA_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

.field public static final enum EA_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

.field public static final enum MAC_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

.field public static final enum NTACL_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

.field public static final enum STREAM_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

.field public static final enum UO_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;


# instance fields
.field private final subblocktype:S


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 23
    new-instance v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;

    const/16 v1, 0x100

    const-string v2, "EA_HEAD"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/github/junrar/rarfile/SubBlockHeaderType;-><init>(Ljava/lang/String;IS)V

    sput-object v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;->EA_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

    .line 24
    new-instance v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;

    const/16 v1, 0x101

    const-string v2, "UO_HEAD"

    const/4 v4, 0x1

    invoke-direct {v0, v2, v4, v1}, Lcom/github/junrar/rarfile/SubBlockHeaderType;-><init>(Ljava/lang/String;IS)V

    sput-object v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;->UO_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

    .line 25
    new-instance v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;

    const/16 v1, 0x102

    const-string v2, "MAC_HEAD"

    const/4 v5, 0x2

    invoke-direct {v0, v2, v5, v1}, Lcom/github/junrar/rarfile/SubBlockHeaderType;-><init>(Ljava/lang/String;IS)V

    sput-object v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;->MAC_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

    .line 26
    new-instance v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;

    const/16 v1, 0x103

    const-string v2, "BEEA_HEAD"

    const/4 v6, 0x3

    invoke-direct {v0, v2, v6, v1}, Lcom/github/junrar/rarfile/SubBlockHeaderType;-><init>(Ljava/lang/String;IS)V

    sput-object v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;->BEEA_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

    .line 27
    new-instance v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;

    const/16 v1, 0x104

    const-string v2, "NTACL_HEAD"

    const/4 v7, 0x4

    invoke-direct {v0, v2, v7, v1}, Lcom/github/junrar/rarfile/SubBlockHeaderType;-><init>(Ljava/lang/String;IS)V

    sput-object v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;->NTACL_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

    .line 28
    new-instance v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;

    const/16 v1, 0x105

    const-string v2, "STREAM_HEAD"

    const/4 v8, 0x5

    invoke-direct {v0, v2, v8, v1}, Lcom/github/junrar/rarfile/SubBlockHeaderType;-><init>(Ljava/lang/String;IS)V

    sput-object v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;->STREAM_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

    .line 22
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/github/junrar/rarfile/SubBlockHeaderType;

    sget-object v1, Lcom/github/junrar/rarfile/SubBlockHeaderType;->EA_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/github/junrar/rarfile/SubBlockHeaderType;->UO_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/github/junrar/rarfile/SubBlockHeaderType;->MAC_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/github/junrar/rarfile/SubBlockHeaderType;->BEEA_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/github/junrar/rarfile/SubBlockHeaderType;->NTACL_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

    aput-object v1, v0, v7

    sget-object v1, Lcom/github/junrar/rarfile/SubBlockHeaderType;->STREAM_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

    aput-object v1, v0, v8

    sput-object v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;->$VALUES:[Lcom/github/junrar/rarfile/SubBlockHeaderType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IS)V
    .locals 0
    .param p3, "subblocktype"    # S
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(S)V"
        }
    .end annotation

    .line 32
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 33
    iput-short p3, p0, Lcom/github/junrar/rarfile/SubBlockHeaderType;->subblocktype:S

    .line 34
    return-void
.end method

.method public static findSubblockHeaderType(S)Lcom/github/junrar/rarfile/SubBlockHeaderType;
    .locals 1
    .param p0, "subType"    # S

    .line 51
    sget-object v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;->EA_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

    invoke-virtual {v0, p0}, Lcom/github/junrar/rarfile/SubBlockHeaderType;->equals(S)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 52
    sget-object v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;->EA_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

    return-object v0

    .line 53
    :cond_0
    sget-object v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;->UO_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

    invoke-virtual {v0, p0}, Lcom/github/junrar/rarfile/SubBlockHeaderType;->equals(S)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 54
    sget-object v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;->UO_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

    return-object v0

    .line 55
    :cond_1
    sget-object v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;->MAC_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

    invoke-virtual {v0, p0}, Lcom/github/junrar/rarfile/SubBlockHeaderType;->equals(S)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 56
    sget-object v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;->MAC_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

    return-object v0

    .line 57
    :cond_2
    sget-object v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;->BEEA_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

    invoke-virtual {v0, p0}, Lcom/github/junrar/rarfile/SubBlockHeaderType;->equals(S)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 58
    sget-object v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;->BEEA_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

    return-object v0

    .line 59
    :cond_3
    sget-object v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;->NTACL_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

    invoke-virtual {v0, p0}, Lcom/github/junrar/rarfile/SubBlockHeaderType;->equals(S)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 60
    sget-object v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;->NTACL_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

    return-object v0

    .line 61
    :cond_4
    sget-object v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;->STREAM_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

    invoke-virtual {v0, p0}, Lcom/github/junrar/rarfile/SubBlockHeaderType;->equals(S)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 62
    sget-object v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;->STREAM_HEAD:Lcom/github/junrar/rarfile/SubBlockHeaderType;

    return-object v0

    .line 64
    :cond_5
    const/4 v0, 0x0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/github/junrar/rarfile/SubBlockHeaderType;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .line 22
    const-class v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;

    return-object v0
.end method

.method public static values()[Lcom/github/junrar/rarfile/SubBlockHeaderType;
    .locals 1

    .line 22
    sget-object v0, Lcom/github/junrar/rarfile/SubBlockHeaderType;->$VALUES:[Lcom/github/junrar/rarfile/SubBlockHeaderType;

    invoke-virtual {v0}, [Lcom/github/junrar/rarfile/SubBlockHeaderType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/github/junrar/rarfile/SubBlockHeaderType;

    return-object v0
.end method


# virtual methods
.method public equals(S)Z
    .locals 1
    .param p1, "subblocktype"    # S

    .line 42
    iget-short v0, p0, Lcom/github/junrar/rarfile/SubBlockHeaderType;->subblocktype:S

    if-ne v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getSubblocktype()S
    .locals 1

    .line 71
    iget-short v0, p0, Lcom/github/junrar/rarfile/SubBlockHeaderType;->subblocktype:S

    return v0
.end method
