.class public final Ld1/g;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field public static final A:[B

.field public static final B:[B

.field public static final C:[B

.field public static final D:[Ljava/lang/String;

.field public static final E:[I

.field public static final F:[B

.field public static final G:Ld1/d;

.field public static final H:[[Ld1/d;

.field public static final I:[Ld1/d;

.field public static final J:[Ljava/util/HashMap;

.field public static final K:[Ljava/util/HashMap;

.field public static final L:Ljava/util/HashSet;

.field public static final M:Ljava/util/HashMap;

.field public static final N:Ljava/nio/charset/Charset;

.field public static final O:[B

.field public static final P:[B

.field public static final l:Z

.field public static final m:Ljava/util/List;

.field public static final n:Ljava/util/List;

.field public static final o:[I

.field public static final p:[I

.field public static final q:[B

.field public static final r:[B

.field public static final s:[B

.field public static final t:[B

.field public static final u:[B

.field public static final v:[B

.field public static final w:[B

.field public static final x:[B

.field public static final y:[B

.field public static final z:[B


# instance fields
.field public final a:Ljava/io/FileDescriptor;

.field public final b:Landroid/content/res/AssetManager$AssetInputStream;

.field public c:I

.field public final d:[Ljava/util/HashMap;

.field public final e:Ljava/util/HashSet;

.field public f:Ljava/nio/ByteOrder;

.field public g:Z

.field public h:I

.field public i:I

.field public j:I

.field public k:I


# direct methods
.method static constructor <clinit>()V
    .locals 125

    const/4 v0, 0x3

    .line 1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 2
    const-string v2, "ExifInterface"

    invoke-static {v2, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    sput-boolean v2, Ld1/g;->l:Z

    const/4 v2, 0x1

    .line 3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x6

    .line 4
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v6, 0x8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x4

    new-array v9, v8, [Ljava/lang/Integer;

    const/4 v10, 0x0

    aput-object v3, v9, v10

    aput-object v5, v9, v2

    const/4 v5, 0x2

    aput-object v1, v9, v5

    aput-object v7, v9, v0

    .line 5
    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    sput-object v9, Ld1/g;->m:Ljava/util/List;

    .line 6
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/4 v11, 0x7

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/4 v14, 0x5

    .line 7
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const/16 v16, 0x0

    new-array v10, v8, [Ljava/lang/Integer;

    aput-object v9, v10, v16

    aput-object v12, v10, v2

    aput-object v13, v10, v5

    aput-object v15, v10, v0

    .line 8
    invoke-static {v10}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    sput-object v10, Ld1/g;->n:Ljava/util/List;

    .line 9
    filled-new-array {v6, v6, v6}, [I

    move-result-object v10

    sput-object v10, Ld1/g;->o:[I

    .line 10
    filled-new-array {v6}, [I

    move-result-object v10

    sput-object v10, Ld1/g;->p:[I

    .line 11
    new-array v10, v0, [B

    fill-array-data v10, :array_0

    sput-object v10, Ld1/g;->q:[B

    .line 12
    new-array v10, v8, [B

    fill-array-data v10, :array_1

    sput-object v10, Ld1/g;->r:[B

    .line 13
    new-array v10, v8, [B

    fill-array-data v10, :array_2

    sput-object v10, Ld1/g;->s:[B

    .line 14
    new-array v10, v8, [B

    fill-array-data v10, :array_3

    sput-object v10, Ld1/g;->t:[B

    .line 15
    new-array v10, v4, [B

    fill-array-data v10, :array_4

    sput-object v10, Ld1/g;->u:[B

    const/16 v10, 0xa

    .line 16
    new-array v13, v10, [B

    fill-array-data v13, :array_5

    sput-object v13, Ld1/g;->v:[B

    .line 17
    new-array v13, v6, [B

    fill-array-data v13, :array_6

    sput-object v13, Ld1/g;->w:[B

    .line 18
    new-array v13, v8, [B

    fill-array-data v13, :array_7

    sput-object v13, Ld1/g;->x:[B

    .line 19
    new-array v13, v8, [B

    fill-array-data v13, :array_8

    sput-object v13, Ld1/g;->y:[B

    .line 20
    new-array v13, v8, [B

    fill-array-data v13, :array_9

    sput-object v13, Ld1/g;->z:[B

    .line 21
    new-array v13, v8, [B

    fill-array-data v13, :array_a

    sput-object v13, Ld1/g;->A:[B

    .line 22
    new-array v13, v8, [B

    fill-array-data v13, :array_b

    sput-object v13, Ld1/g;->B:[B

    .line 23
    new-array v13, v8, [B

    fill-array-data v13, :array_c

    sput-object v13, Ld1/g;->C:[B

    .line 24
    const-string v13, "VP8X"

    const/16 v17, 0xa

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v10

    invoke-virtual {v13, v10}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 25
    const-string v10, "VP8L"

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 26
    const-string v10, "VP8 "

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 27
    const-string v10, "ANIM"

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 28
    const-string v10, "ANMF"

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 29
    const-string v30, "DOUBLE"

    const-string v31, "IFD"

    const-string v18, ""

    const-string v19, "BYTE"

    const-string v20, "STRING"

    const-string v21, "USHORT"

    const-string v22, "ULONG"

    const-string v23, "URATIONAL"

    const-string v24, "SBYTE"

    const-string v25, "UNDEFINED"

    const-string v26, "SSHORT"

    const-string v27, "SLONG"

    const-string v28, "SRATIONAL"

    const-string v29, "SINGLE"

    filled-new-array/range {v18 .. v31}, [Ljava/lang/String;

    move-result-object v10

    sput-object v10, Ld1/g;->D:[Ljava/lang/String;

    const/16 v10, 0xe

    .line 30
    new-array v13, v10, [I

    fill-array-data v13, :array_d

    sput-object v13, Ld1/g;->E:[I

    .line 31
    new-array v13, v6, [B

    fill-array-data v13, :array_e

    sput-object v13, Ld1/g;->F:[B

    .line 32
    new-instance v13, Ld1/d;

    const/16 v18, 0xe

    const-string v10, "NewSubfileType"

    const/16 v19, 0x8

    const/16 v6, 0xfe

    invoke-direct {v13, v10, v6, v8}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v6, Ld1/d;

    const-string v2, "SubfileType"

    const/16 v11, 0xff

    invoke-direct {v6, v2, v11, v8}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v4, "ImageWidth"

    const/16 v14, 0x100

    invoke-direct {v11, v4, v14, v0, v8}, Ld1/d;-><init>(Ljava/lang/String;III)V

    new-instance v4, Ld1/d;

    const-string v14, "ImageLength"

    const/16 v5, 0x101

    invoke-direct {v4, v14, v5, v0, v8}, Ld1/d;-><init>(Ljava/lang/String;III)V

    new-instance v14, Ld1/d;

    const-string v5, "BitsPerSample"

    const/16 v8, 0x102

    invoke-direct {v14, v5, v8, v0}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v8, Ld1/d;

    move-object/from16 v31, v4

    const-string v4, "Compression"

    move-object/from16 v32, v6

    const/16 v6, 0x103

    invoke-direct {v8, v4, v6, v0}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v6, Ld1/d;

    move-object/from16 v34, v8

    const-string v8, "PhotometricInterpretation"

    move-object/from16 v35, v11

    const/16 v11, 0x106

    invoke-direct {v6, v8, v11, v0}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v0, "ImageDescription"

    move-object/from16 v38, v6

    const/16 v6, 0x10e

    move-object/from16 v39, v13

    const/4 v13, 0x2

    invoke-direct {v11, v0, v6, v13}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v6, Ld1/d;

    move-object/from16 v41, v11

    const/16 v11, 0x10f

    move-object/from16 v42, v14

    const-string v14, "Make"

    invoke-direct {v6, v14, v11, v13}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    move-object/from16 v43, v6

    const-string v6, "Model"

    move-object/from16 v44, v7

    const/16 v7, 0x110

    invoke-direct {v11, v6, v7, v13}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v6, Ld1/d;

    const-string v7, "StripOffsets"

    const/16 v13, 0x111

    move-object/from16 v45, v11

    move-object/from16 v46, v12

    const/4 v11, 0x3

    const/4 v12, 0x4

    invoke-direct {v6, v7, v13, v11, v12}, Ld1/d;-><init>(Ljava/lang/String;III)V

    new-instance v12, Ld1/d;

    const-string v13, "Orientation"

    move-object/from16 v47, v6

    const/16 v6, 0x112

    invoke-direct {v12, v13, v6, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v6, Ld1/d;

    const-string v13, "SamplesPerPixel"

    move-object/from16 v48, v12

    const/16 v12, 0x115

    invoke-direct {v6, v13, v12, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v12, Ld1/d;

    const-string v13, "RowsPerStrip"

    move-object/from16 v49, v6

    const/16 v6, 0x116

    move-object/from16 v50, v1

    const/4 v1, 0x4

    invoke-direct {v12, v13, v6, v11, v1}, Ld1/d;-><init>(Ljava/lang/String;III)V

    new-instance v6, Ld1/d;

    const-string v13, "StripByteCounts"

    move-object/from16 v51, v12

    const/16 v12, 0x117

    invoke-direct {v6, v13, v12, v11, v1}, Ld1/d;-><init>(Ljava/lang/String;III)V

    new-instance v1, Ld1/d;

    const-string v11, "XResolution"

    const/16 v12, 0x11a

    const/4 v13, 0x5

    invoke-direct {v1, v11, v12, v13}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v12, "YResolution"

    move-object/from16 v52, v1

    const/16 v1, 0x11b

    invoke-direct {v11, v12, v1, v13}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v1, Ld1/d;

    const-string v12, "PlanarConfiguration"

    const/16 v13, 0x11c

    move-object/from16 v53, v6

    const/4 v6, 0x3

    invoke-direct {v1, v12, v13, v6}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v12, Ld1/d;

    const-string v13, "ResolutionUnit"

    move-object/from16 v54, v1

    const/16 v1, 0x128

    invoke-direct {v12, v13, v1, v6}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v1, Ld1/d;

    const-string v13, "TransferFunction"

    move-object/from16 v55, v11

    const/16 v11, 0x12d

    invoke-direct {v1, v13, v11, v6}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v6, Ld1/d;

    const-string v11, "Software"

    const/16 v13, 0x131

    move-object/from16 v56, v1

    const/4 v1, 0x2

    invoke-direct {v6, v11, v13, v1}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v13, "DateTime"

    move-object/from16 v57, v6

    const/16 v6, 0x132

    invoke-direct {v11, v13, v6, v1}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v6, Ld1/d;

    const-string v13, "Artist"

    move-object/from16 v58, v11

    const/16 v11, 0x13b

    invoke-direct {v6, v13, v11, v1}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v1, Ld1/d;

    const-string v11, "WhitePoint"

    const/16 v13, 0x13e

    move-object/from16 v59, v6

    const/4 v6, 0x5

    invoke-direct {v1, v11, v13, v6}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v13, "PrimaryChromaticities"

    move-object/from16 v60, v1

    const/16 v1, 0x13f

    invoke-direct {v11, v13, v1, v6}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v1, Ld1/d;

    const-string v6, "SubIFDPointer"

    const/16 v13, 0x14a

    move-object/from16 v61, v11

    const/4 v11, 0x4

    invoke-direct {v1, v6, v13, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v13, Ld1/d;

    move-object/from16 v62, v1

    const-string v1, "JPEGInterchangeFormat"

    move-object/from16 v63, v12

    const/16 v12, 0x201

    invoke-direct {v13, v1, v12, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v1, Ld1/d;

    const-string v12, "JPEGInterchangeFormatLength"

    move-object/from16 v64, v13

    const/16 v13, 0x202

    invoke-direct {v1, v12, v13, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v12, "YCbCrCoefficients"

    const/16 v13, 0x211

    move-object/from16 v65, v1

    const/4 v1, 0x5

    invoke-direct {v11, v12, v13, v1}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v1, Ld1/d;

    const-string v12, "YCbCrSubSampling"

    const/16 v13, 0x212

    move-object/from16 v66, v11

    const/4 v11, 0x3

    invoke-direct {v1, v12, v13, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v12, Ld1/d;

    const-string v13, "YCbCrPositioning"

    move-object/from16 v67, v1

    const/16 v1, 0x213

    invoke-direct {v12, v13, v1, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v1, Ld1/d;

    const-string v11, "ReferenceBlackWhite"

    const/16 v13, 0x214

    move-object/from16 v68, v12

    const/4 v12, 0x5

    invoke-direct {v1, v11, v13, v12}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v12, "Copyright"

    const v13, 0x8298

    move-object/from16 v69, v1

    const/4 v1, 0x2

    invoke-direct {v11, v12, v13, v1}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v1, Ld1/d;

    const-string v12, "ExifIFDPointer"

    const v13, 0x8769

    move-object/from16 v70, v11

    const/4 v11, 0x4

    invoke-direct {v1, v12, v13, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v13, Ld1/d;

    move-object/from16 v71, v1

    const-string v1, "GPSInfoIFDPointer"

    move-object/from16 v72, v9

    const v9, 0x8825

    invoke-direct {v13, v1, v9, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    move-object/from16 v73, v13

    const-string v13, "SensorTopBorder"

    invoke-direct {v9, v13, v11, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v13, Ld1/d;

    move-object/from16 v74, v9

    const-string v9, "SensorLeftBorder"

    move-object/from16 v75, v3

    const/4 v3, 0x5

    invoke-direct {v13, v9, v3, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v9, "SensorBottomBorder"

    move-object/from16 v76, v13

    const/4 v13, 0x6

    invoke-direct {v3, v9, v13, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v13, "SensorRightBorder"

    move-object/from16 v77, v3

    const/4 v3, 0x7

    invoke-direct {v9, v13, v3, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v13, "ISO"

    const/16 v3, 0x17

    move-object/from16 v78, v9

    const/4 v9, 0x3

    invoke-direct {v11, v13, v3, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v13, "JpgFromRaw"

    const/16 v79, 0x17

    const/16 v3, 0x2e

    move-object/from16 v80, v11

    const/4 v11, 0x7

    invoke-direct {v9, v13, v3, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v11, "Xmp"

    const/16 v13, 0x2bc

    move-object/from16 v81, v9

    const/4 v9, 0x1

    invoke-direct {v3, v11, v13, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    const/16 v11, 0x2a

    new-array v11, v11, [Ld1/d;

    aput-object v39, v11, v16

    aput-object v32, v11, v9

    const/16 v27, 0x2

    aput-object v35, v11, v27

    const/16 v37, 0x3

    aput-object v31, v11, v37

    const/16 v29, 0x4

    aput-object v42, v11, v29

    const/16 v25, 0x5

    aput-object v34, v11, v25

    const/16 v24, 0x6

    aput-object v38, v11, v24

    const/16 v22, 0x7

    aput-object v41, v11, v22

    aput-object v43, v11, v19

    const/16 v9, 0x9

    aput-object v45, v11, v9

    aput-object v47, v11, v17

    const/16 v13, 0xb

    aput-object v48, v11, v13

    const/16 v31, 0xb

    const/16 v13, 0xc

    aput-object v49, v11, v13

    const/16 v32, 0xc

    const/16 v13, 0xd

    aput-object v51, v11, v13

    aput-object v53, v11, v18

    const/16 v34, 0xd

    const/16 v13, 0xf

    aput-object v52, v11, v13

    const/16 v35, 0xf

    const/16 v13, 0x10

    aput-object v55, v11, v13

    const/16 v38, 0x10

    const/16 v13, 0x11

    aput-object v54, v11, v13

    const/16 v39, 0x11

    const/16 v13, 0x12

    aput-object v63, v11, v13

    const/16 v41, 0x13

    aput-object v56, v11, v41

    const/16 v41, 0x14

    aput-object v57, v11, v41

    const/16 v41, 0x15

    aput-object v58, v11, v41

    const/16 v41, 0x16

    aput-object v59, v11, v41

    aput-object v60, v11, v79

    const/16 v41, 0x18

    aput-object v61, v11, v41

    const/16 v41, 0x19

    aput-object v62, v11, v41

    const/16 v41, 0x12

    const/16 v13, 0x1a

    aput-object v64, v11, v13

    const/16 v42, 0x1b

    aput-object v65, v11, v42

    const/16 v42, 0x1c

    aput-object v66, v11, v42

    const/16 v42, 0x1d

    aput-object v67, v11, v42

    const/16 v42, 0x1e

    aput-object v68, v11, v42

    const/16 v42, 0x1f

    aput-object v69, v11, v42

    const/16 v42, 0x20

    aput-object v70, v11, v42

    const/16 v42, 0x21

    aput-object v71, v11, v42

    const/16 v42, 0x22

    aput-object v73, v11, v42

    const/16 v42, 0x23

    aput-object v74, v11, v42

    const/16 v42, 0x24

    aput-object v76, v11, v42

    const/16 v42, 0x25

    aput-object v77, v11, v42

    const/16 v42, 0x26

    aput-object v78, v11, v42

    const/16 v42, 0x27

    aput-object v80, v11, v42

    const/16 v42, 0x28

    aput-object v81, v11, v42

    const/16 v42, 0x29

    aput-object v3, v11, v42

    .line 33
    new-instance v3, Ld1/d;

    const/16 v42, 0x1a

    const-string v13, "ExposureTime"

    const/16 v43, 0x9

    const v9, 0x829a

    move-object/from16 v45, v11

    const/4 v11, 0x5

    invoke-direct {v3, v13, v9, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v13, "FNumber"

    move-object/from16 v47, v3

    const v3, 0x829d

    invoke-direct {v9, v13, v3, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v11, "ExposureProgram"

    const v13, 0x8822

    move-object/from16 v48, v9

    const/4 v9, 0x3

    invoke-direct {v3, v11, v13, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v13, "SpectralSensitivity"

    const v9, 0x8824

    move-object/from16 v49, v3

    const/4 v3, 0x2

    invoke-direct {v11, v13, v9, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v9, "PhotographicSensitivity"

    const v13, 0x8827

    move-object/from16 v51, v11

    const/4 v11, 0x3

    invoke-direct {v3, v9, v13, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v13, "OECF"

    const v11, 0x8828

    move-object/from16 v52, v3

    const/4 v3, 0x7

    invoke-direct {v9, v13, v11, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v11, "SensitivityType"

    const v13, 0x8830

    move-object/from16 v53, v9

    const/4 v9, 0x3

    invoke-direct {v3, v11, v13, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v11, "StandardOutputSensitivity"

    const v13, 0x8831

    move-object/from16 v54, v3

    const/4 v3, 0x4

    invoke-direct {v9, v11, v13, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v13, "RecommendedExposureIndex"

    move-object/from16 v55, v9

    const v9, 0x8832

    invoke-direct {v11, v13, v9, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v13, "ISOSpeed"

    move-object/from16 v56, v11

    const v11, 0x8833

    invoke-direct {v9, v13, v11, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v13, "ISOSpeedLatitudeyyy"

    move-object/from16 v57, v9

    const v9, 0x8834

    invoke-direct {v11, v13, v9, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v13, "ISOSpeedLatitudezzz"

    move-object/from16 v58, v11

    const v11, 0x8835

    invoke-direct {v9, v13, v11, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v11, "ExifVersion"

    const v13, 0x9000

    move-object/from16 v59, v9

    const/4 v9, 0x2

    invoke-direct {v3, v11, v13, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v13, "DateTimeOriginal"

    move-object/from16 v60, v3

    const v3, 0x9003

    invoke-direct {v11, v13, v3, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v13, "DateTimeDigitized"

    move-object/from16 v61, v11

    const v11, 0x9004

    invoke-direct {v3, v13, v11, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v13, "OffsetTime"

    move-object/from16 v62, v3

    const v3, 0x9010

    invoke-direct {v11, v13, v3, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v13, "OffsetTimeOriginal"

    move-object/from16 v63, v11

    const v11, 0x9011

    invoke-direct {v3, v13, v11, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v13, "OffsetTimeDigitized"

    move-object/from16 v64, v3

    const v3, 0x9012

    invoke-direct {v11, v13, v3, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v9, "ComponentsConfiguration"

    const v13, 0x9101

    move-object/from16 v65, v11

    const/4 v11, 0x7

    invoke-direct {v3, v9, v13, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v11, "CompressedBitsPerPixel"

    const v13, 0x9102

    move-object/from16 v66, v3

    const/4 v3, 0x5

    invoke-direct {v9, v11, v13, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v13, "ShutterSpeedValue"

    const v3, 0x9201

    move-object/from16 v67, v9

    const/16 v9, 0xa

    invoke-direct {v11, v13, v3, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v13, "ApertureValue"

    const v9, 0x9202

    move-object/from16 v68, v11

    const/4 v11, 0x5

    invoke-direct {v3, v13, v9, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v11, "BrightnessValue"

    const v13, 0x9203

    move-object/from16 v69, v3

    const/16 v3, 0xa

    invoke-direct {v9, v11, v13, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v13, "ExposureBiasValue"

    move-object/from16 v70, v9

    const v9, 0x9204

    invoke-direct {v11, v13, v9, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v9, "MaxApertureValue"

    const v13, 0x9205

    move-object/from16 v71, v11

    const/4 v11, 0x5

    invoke-direct {v3, v9, v13, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v13, "SubjectDistance"

    move-object/from16 v73, v3

    const v3, 0x9206

    invoke-direct {v9, v13, v3, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v11, "MeteringMode"

    const v13, 0x9207

    move-object/from16 v74, v9

    const/4 v9, 0x3

    invoke-direct {v3, v11, v13, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v13, "LightSource"

    move-object/from16 v76, v3

    const v3, 0x9208

    invoke-direct {v11, v13, v3, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v13, "Flash"

    move-object/from16 v77, v11

    const v11, 0x9209

    invoke-direct {v3, v13, v11, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v13, "FocalLength"

    const v9, 0x920a

    move-object/from16 v78, v3

    const/4 v3, 0x5

    invoke-direct {v11, v13, v9, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v9, "SubjectArea"

    const v13, 0x9214

    move-object/from16 v80, v11

    const/4 v11, 0x3

    invoke-direct {v3, v9, v13, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v11, "MakerNote"

    const v13, 0x927c

    move-object/from16 v81, v3

    const/4 v3, 0x7

    invoke-direct {v9, v11, v13, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v13, "UserComment"

    move-object/from16 v82, v9

    const v9, 0x9286

    invoke-direct {v11, v13, v9, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v9, "SubSecTime"

    const v13, 0x9290

    move-object/from16 v83, v11

    const/4 v11, 0x2

    invoke-direct {v3, v9, v13, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v13, "SubSecTimeOriginal"

    move-object/from16 v84, v3

    const v3, 0x9291

    invoke-direct {v9, v13, v3, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v13, "SubSecTimeDigitized"

    move-object/from16 v85, v9

    const v9, 0x9292

    invoke-direct {v3, v13, v9, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v11, "FlashpixVersion"

    const v13, 0xa000

    move-object/from16 v86, v3

    const/4 v3, 0x7

    invoke-direct {v9, v11, v13, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v11, "ColorSpace"

    const v13, 0xa001

    move-object/from16 v87, v9

    const/4 v9, 0x3

    invoke-direct {v3, v11, v13, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v13, "PixelXDimension"

    move-object/from16 v88, v3

    const v3, 0xa002

    move-object/from16 v89, v15

    const/4 v15, 0x4

    invoke-direct {v11, v13, v3, v9, v15}, Ld1/d;-><init>(Ljava/lang/String;III)V

    new-instance v3, Ld1/d;

    const-string v13, "PixelYDimension"

    move-object/from16 v90, v11

    const v11, 0xa003

    invoke-direct {v3, v13, v11, v9, v15}, Ld1/d;-><init>(Ljava/lang/String;III)V

    new-instance v9, Ld1/d;

    const-string v11, "RelatedSoundFile"

    const v13, 0xa004

    const/4 v15, 0x2

    invoke-direct {v9, v11, v13, v15}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v13, "InteroperabilityIFDPointer"

    const v15, 0xa005

    move-object/from16 v91, v3

    const/4 v3, 0x4

    invoke-direct {v11, v13, v15, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v13, "FlashEnergy"

    const v15, 0xa20b

    move-object/from16 v92, v9

    const/4 v9, 0x5

    invoke-direct {v3, v13, v15, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v13, Ld1/d;

    const-string v15, "SpatialFrequencyResponse"

    const v9, 0xa20c

    move-object/from16 v93, v3

    const/4 v3, 0x7

    invoke-direct {v13, v15, v9, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v9, "FocalPlaneXResolution"

    const v15, 0xa20e

    move-object/from16 v94, v11

    const/4 v11, 0x5

    invoke-direct {v3, v9, v15, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v15, "FocalPlaneYResolution"

    move-object/from16 v95, v3

    const v3, 0xa20f

    invoke-direct {v9, v15, v3, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v11, "FocalPlaneResolutionUnit"

    const v15, 0xa210

    move-object/from16 v96, v9

    const/4 v9, 0x3

    invoke-direct {v3, v11, v15, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v15, "SubjectLocation"

    move-object/from16 v97, v3

    const v3, 0xa214

    invoke-direct {v11, v15, v3, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v15, "ExposureIndex"

    const v9, 0xa215

    move-object/from16 v98, v11

    const/4 v11, 0x5

    invoke-direct {v3, v15, v9, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v11, "SensingMethod"

    const v15, 0xa217

    move-object/from16 v99, v3

    const/4 v3, 0x3

    invoke-direct {v9, v11, v15, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v11, "FileSource"

    const v15, 0xa300

    move-object/from16 v100, v9

    const/4 v9, 0x7

    invoke-direct {v3, v11, v15, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v15, "SceneType"

    move-object/from16 v101, v3

    const v3, 0xa301

    invoke-direct {v11, v15, v3, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v15, "CFAPattern"

    move-object/from16 v102, v11

    const v11, 0xa302

    invoke-direct {v3, v15, v11, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v11, "CustomRendered"

    const v15, 0xa401

    move-object/from16 v103, v3

    const/4 v3, 0x3

    invoke-direct {v9, v11, v15, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v15, "ExposureMode"

    move-object/from16 v104, v9

    const v9, 0xa402

    invoke-direct {v11, v15, v9, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v15, "WhiteBalance"

    move-object/from16 v105, v11

    const v11, 0xa403

    invoke-direct {v9, v15, v11, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v15, "DigitalZoomRatio"

    const v3, 0xa404

    move-object/from16 v106, v9

    const/4 v9, 0x5

    invoke-direct {v11, v15, v3, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v9, "FocalLengthIn35mmFilm"

    const v15, 0xa405

    move-object/from16 v107, v11

    const/4 v11, 0x3

    invoke-direct {v3, v9, v15, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v15, "SceneCaptureType"

    move-object/from16 v108, v3

    const v3, 0xa406

    invoke-direct {v9, v15, v3, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v15, "GainControl"

    move-object/from16 v109, v9

    const v9, 0xa407

    invoke-direct {v3, v15, v9, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v15, "Contrast"

    move-object/from16 v110, v3

    const v3, 0xa408

    invoke-direct {v9, v15, v3, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v15, "Saturation"

    move-object/from16 v111, v9

    const v9, 0xa409

    invoke-direct {v3, v15, v9, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v15, "Sharpness"

    move-object/from16 v112, v3

    const v3, 0xa40a

    invoke-direct {v9, v15, v3, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v15, "DeviceSettingDescription"

    const v11, 0xa40b

    move-object/from16 v113, v9

    const/4 v9, 0x7

    invoke-direct {v3, v15, v11, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v11, "SubjectDistanceRange"

    const v15, 0xa40c

    move-object/from16 v114, v3

    const/4 v3, 0x3

    invoke-direct {v9, v11, v15, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v11, "ImageUniqueID"

    const v15, 0xa420

    move-object/from16 v115, v9

    const/4 v9, 0x2

    invoke-direct {v3, v11, v15, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v15, "CameraOwnerName"

    move-object/from16 v116, v3

    const v3, 0xa430

    invoke-direct {v11, v15, v3, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v15, "BodySerialNumber"

    move-object/from16 v117, v11

    const v11, 0xa431

    invoke-direct {v3, v15, v11, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v15, "LensSpecification"

    const v9, 0xa432

    move-object/from16 v118, v3

    const/4 v3, 0x5

    invoke-direct {v11, v15, v9, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v9, "LensMake"

    const v15, 0xa433

    move-object/from16 v119, v11

    const/4 v11, 0x2

    invoke-direct {v3, v9, v15, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v15, "LensModel"

    move-object/from16 v120, v3

    const v3, 0xa434

    invoke-direct {v9, v15, v3, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v11, "Gamma"

    const v15, 0xa500

    move-object/from16 v121, v9

    const/4 v9, 0x5

    invoke-direct {v3, v11, v15, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v11, "DNGVersion"

    const v15, 0xc612

    move-object/from16 v122, v3

    const/4 v3, 0x1

    invoke-direct {v9, v11, v15, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v15, "DefaultCropSize"

    const/16 v21, 0x1

    const v3, 0xc620

    move-object/from16 v123, v9

    move-object/from16 v124, v13

    const/4 v9, 0x3

    const/4 v13, 0x4

    invoke-direct {v11, v15, v3, v9, v13}, Ld1/d;-><init>(Ljava/lang/String;III)V

    const/16 v3, 0x4a

    new-array v3, v3, [Ld1/d;

    aput-object v47, v3, v16

    aput-object v48, v3, v21

    const/16 v27, 0x2

    aput-object v49, v3, v27

    aput-object v51, v3, v9

    aput-object v52, v3, v13

    const/16 v25, 0x5

    aput-object v53, v3, v25

    const/16 v24, 0x6

    aput-object v54, v3, v24

    const/16 v22, 0x7

    aput-object v55, v3, v22

    aput-object v56, v3, v19

    aput-object v57, v3, v43

    const/16 v17, 0xa

    aput-object v58, v3, v17

    aput-object v59, v3, v31

    aput-object v60, v3, v32

    aput-object v61, v3, v34

    aput-object v62, v3, v18

    aput-object v63, v3, v35

    aput-object v64, v3, v38

    aput-object v65, v3, v39

    aput-object v66, v3, v41

    const/16 v9, 0x13

    aput-object v67, v3, v9

    const/16 v9, 0x14

    aput-object v68, v3, v9

    const/16 v9, 0x15

    aput-object v69, v3, v9

    const/16 v9, 0x16

    aput-object v70, v3, v9

    aput-object v71, v3, v79

    const/16 v9, 0x18

    aput-object v73, v3, v9

    const/16 v9, 0x19

    aput-object v74, v3, v9

    aput-object v76, v3, v42

    const/16 v9, 0x1b

    aput-object v77, v3, v9

    const/16 v9, 0x1c

    aput-object v78, v3, v9

    const/16 v9, 0x1d

    aput-object v80, v3, v9

    const/16 v9, 0x1e

    aput-object v81, v3, v9

    const/16 v9, 0x1f

    aput-object v82, v3, v9

    const/16 v9, 0x20

    aput-object v83, v3, v9

    const/16 v9, 0x21

    aput-object v84, v3, v9

    const/16 v9, 0x22

    aput-object v85, v3, v9

    const/16 v9, 0x23

    aput-object v86, v3, v9

    const/16 v9, 0x24

    aput-object v87, v3, v9

    const/16 v9, 0x25

    aput-object v88, v3, v9

    const/16 v9, 0x26

    aput-object v90, v3, v9

    const/16 v9, 0x27

    aput-object v91, v3, v9

    const/16 v9, 0x28

    aput-object v92, v3, v9

    const/16 v9, 0x29

    aput-object v94, v3, v9

    const/16 v9, 0x2a

    aput-object v93, v3, v9

    const/16 v9, 0x2b

    aput-object v124, v3, v9

    const/16 v9, 0x2c

    aput-object v95, v3, v9

    const/16 v9, 0x2d

    aput-object v96, v3, v9

    const/16 v9, 0x2e

    aput-object v97, v3, v9

    const/16 v9, 0x2f

    aput-object v98, v3, v9

    const/16 v9, 0x30

    aput-object v99, v3, v9

    const/16 v9, 0x31

    aput-object v100, v3, v9

    const/16 v9, 0x32

    aput-object v101, v3, v9

    const/16 v9, 0x33

    aput-object v102, v3, v9

    const/16 v9, 0x34

    aput-object v103, v3, v9

    const/16 v9, 0x35

    aput-object v104, v3, v9

    const/16 v9, 0x36

    aput-object v105, v3, v9

    const/16 v9, 0x37

    aput-object v106, v3, v9

    const/16 v9, 0x38

    aput-object v107, v3, v9

    const/16 v9, 0x39

    aput-object v108, v3, v9

    const/16 v9, 0x3a

    aput-object v109, v3, v9

    const/16 v9, 0x3b

    aput-object v110, v3, v9

    const/16 v9, 0x3c

    aput-object v111, v3, v9

    const/16 v9, 0x3d

    aput-object v112, v3, v9

    const/16 v9, 0x3e

    aput-object v113, v3, v9

    const/16 v9, 0x3f

    aput-object v114, v3, v9

    const/16 v9, 0x40

    aput-object v115, v3, v9

    const/16 v9, 0x41

    aput-object v116, v3, v9

    const/16 v9, 0x42

    aput-object v117, v3, v9

    const/16 v9, 0x43

    aput-object v118, v3, v9

    const/16 v9, 0x44

    aput-object v119, v3, v9

    const/16 v9, 0x45

    aput-object v120, v3, v9

    const/16 v9, 0x46

    aput-object v121, v3, v9

    const/16 v9, 0x47

    aput-object v122, v3, v9

    const/16 v9, 0x48

    aput-object v123, v3, v9

    const/16 v9, 0x49

    aput-object v11, v3, v9

    .line 34
    new-instance v9, Ld1/d;

    const-string v11, "GPSVersionID"

    const/4 v13, 0x1

    const/4 v15, 0x0

    invoke-direct {v9, v11, v15, v13}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v15, "GPSLatitudeRef"

    move-object/from16 v47, v3

    const/4 v3, 0x2

    invoke-direct {v11, v15, v13, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v13, Ld1/d;

    const-string v15, "GPSLatitude"

    move-object/from16 v48, v9

    move-object/from16 v49, v11

    const/4 v9, 0x5

    const/16 v11, 0xa

    invoke-direct {v13, v15, v3, v9, v11}, Ld1/d;-><init>(Ljava/lang/String;III)V

    new-instance v15, Ld1/d;

    const-string v9, "GPSLongitudeRef"

    const/4 v11, 0x3

    invoke-direct {v15, v9, v11, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v9, "GPSLongitude"

    move-object/from16 v51, v13

    move-object/from16 v52, v15

    const/4 v11, 0x4

    const/4 v13, 0x5

    const/16 v15, 0xa

    invoke-direct {v3, v9, v11, v13, v15}, Ld1/d;-><init>(Ljava/lang/String;III)V

    new-instance v9, Ld1/d;

    const-string v11, "GPSAltitudeRef"

    const/4 v15, 0x1

    invoke-direct {v9, v11, v13, v15}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v15, "GPSAltitude"

    move-object/from16 v53, v3

    const/4 v3, 0x6

    invoke-direct {v11, v15, v3, v13}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v15, "GPSTimeStamp"

    move-object/from16 v54, v9

    const/4 v9, 0x7

    invoke-direct {v3, v15, v9, v13}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v13, "GPSSatellites"

    move-object/from16 v55, v3

    const/4 v3, 0x2

    const/16 v15, 0x8

    invoke-direct {v9, v13, v15, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v13, Ld1/d;

    const-string v15, "GPSStatus"

    move-object/from16 v56, v9

    const/16 v9, 0x9

    invoke-direct {v13, v15, v9, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v15, "GPSMeasureMode"

    move-object/from16 v57, v11

    const/16 v11, 0xa

    invoke-direct {v9, v15, v11, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v15, "GPSDOP"

    move-object/from16 v58, v9

    const/4 v3, 0x5

    const/16 v9, 0xb

    invoke-direct {v11, v15, v9, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v15, "GPSSpeedRef"

    move-object/from16 v59, v11

    const/4 v3, 0x2

    const/16 v11, 0xc

    invoke-direct {v9, v15, v11, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v15, "GPSSpeed"

    move-object/from16 v60, v9

    const/4 v3, 0x5

    const/16 v9, 0xd

    invoke-direct {v11, v15, v9, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v15, "GPSTrackRef"

    move-object/from16 v61, v11

    const/4 v3, 0x2

    const/16 v11, 0xe

    invoke-direct {v9, v15, v11, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v15, "GPSTrack"

    move-object/from16 v62, v9

    const/4 v3, 0x5

    const/16 v9, 0xf

    invoke-direct {v11, v15, v9, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v15, "GPSImgDirectionRef"

    move-object/from16 v63, v11

    const/4 v3, 0x2

    const/16 v11, 0x10

    invoke-direct {v9, v15, v11, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v15, "GPSImgDirection"

    move-object/from16 v64, v9

    const/4 v3, 0x5

    const/16 v9, 0x11

    invoke-direct {v11, v15, v9, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v15, "GPSMapDatum"

    move-object/from16 v65, v11

    const/4 v3, 0x2

    const/16 v11, 0x12

    invoke-direct {v9, v15, v11, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v15, "GPSDestLatitudeRef"

    move-object/from16 v66, v9

    const/16 v9, 0x13

    invoke-direct {v11, v15, v9, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v15, "GPSDestLatitude"

    const/16 v3, 0x14

    move-object/from16 v67, v11

    const/4 v11, 0x5

    invoke-direct {v9, v15, v3, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v15, "GPSDestLongitudeRef"

    const/16 v11, 0x15

    move-object/from16 v68, v9

    const/4 v9, 0x2

    invoke-direct {v3, v15, v11, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v15, "GPSDestLongitude"

    const/16 v9, 0x16

    move-object/from16 v69, v3

    const/4 v3, 0x5

    invoke-direct {v11, v15, v9, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v15, "GPSDestBearingRef"

    move-object/from16 v70, v11

    const/4 v3, 0x2

    const/16 v11, 0x17

    invoke-direct {v9, v15, v11, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v15, "GPSDestBearing"

    const/16 v3, 0x18

    move-object/from16 v71, v9

    const/4 v9, 0x5

    invoke-direct {v11, v15, v3, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v15, "GPSDestDistanceRef"

    const/16 v9, 0x19

    move-object/from16 v73, v11

    const/4 v11, 0x2

    invoke-direct {v3, v15, v9, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v11, "GPSDestDistance"

    move-object/from16 v74, v3

    const/16 v3, 0x1a

    const/4 v15, 0x5

    invoke-direct {v9, v11, v3, v15}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v11, "GPSProcessingMethod"

    const/16 v15, 0x1b

    move-object/from16 v76, v9

    const/4 v9, 0x7

    invoke-direct {v3, v11, v15, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v15, "GPSAreaInformation"

    move-object/from16 v77, v3

    const/16 v3, 0x1c

    invoke-direct {v11, v15, v3, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v9, "GPSDateStamp"

    const/16 v15, 0x1d

    move-object/from16 v78, v11

    const/4 v11, 0x2

    invoke-direct {v3, v9, v15, v11}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v9, Ld1/d;

    const-string v11, "GPSDifferential"

    const/16 v15, 0x1e

    move-object/from16 v80, v3

    const/4 v3, 0x3

    invoke-direct {v9, v11, v15, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v11, Ld1/d;

    const-string v15, "GPSHPositioningError"

    const/16 v37, 0x3

    const/16 v3, 0x1f

    move-object/from16 v81, v9

    const/4 v9, 0x5

    invoke-direct {v11, v15, v3, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    const/16 v3, 0x20

    new-array v3, v3, [Ld1/d;

    const/16 v16, 0x0

    aput-object v48, v3, v16

    const/16 v21, 0x1

    aput-object v49, v3, v21

    const/16 v27, 0x2

    aput-object v51, v3, v27

    aput-object v52, v3, v37

    const/16 v29, 0x4

    aput-object v53, v3, v29

    aput-object v54, v3, v9

    const/16 v24, 0x6

    aput-object v57, v3, v24

    const/16 v22, 0x7

    aput-object v55, v3, v22

    const/16 v19, 0x8

    aput-object v56, v3, v19

    const/16 v43, 0x9

    aput-object v13, v3, v43

    const/16 v17, 0xa

    aput-object v58, v3, v17

    const/16 v31, 0xb

    aput-object v59, v3, v31

    const/16 v32, 0xc

    aput-object v60, v3, v32

    const/16 v34, 0xd

    aput-object v61, v3, v34

    const/16 v18, 0xe

    aput-object v62, v3, v18

    const/16 v35, 0xf

    aput-object v63, v3, v35

    const/16 v38, 0x10

    aput-object v64, v3, v38

    const/16 v39, 0x11

    aput-object v65, v3, v39

    const/16 v41, 0x12

    aput-object v66, v3, v41

    const/16 v9, 0x13

    aput-object v67, v3, v9

    const/16 v9, 0x14

    aput-object v68, v3, v9

    const/16 v9, 0x15

    aput-object v69, v3, v9

    const/16 v9, 0x16

    aput-object v70, v3, v9

    const/16 v79, 0x17

    aput-object v71, v3, v79

    const/16 v9, 0x18

    aput-object v73, v3, v9

    const/16 v9, 0x19

    aput-object v74, v3, v9

    const/16 v42, 0x1a

    aput-object v76, v3, v42

    const/16 v9, 0x1b

    aput-object v77, v3, v9

    const/16 v9, 0x1c

    aput-object v78, v3, v9

    const/16 v9, 0x1d

    aput-object v80, v3, v9

    const/16 v9, 0x1e

    aput-object v81, v3, v9

    const/16 v9, 0x1f

    aput-object v11, v3, v9

    .line 35
    new-instance v9, Ld1/d;

    const-string v11, "InteroperabilityIndex"

    const/4 v13, 0x1

    const/4 v15, 0x2

    invoke-direct {v9, v11, v13, v15}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-array v11, v13, [Ld1/d;

    const/16 v16, 0x0

    aput-object v9, v11, v16

    .line 36
    new-instance v9, Ld1/d;

    const/4 v13, 0x4

    const/16 v15, 0xfe

    invoke-direct {v9, v10, v15, v13}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v10, Ld1/d;

    const/16 v15, 0xff

    invoke-direct {v10, v2, v15, v13}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v2, Ld1/d;

    const-string v15, "ThumbnailImageWidth"

    move-object/from16 v20, v3

    move-object/from16 v23, v9

    const/4 v3, 0x3

    const/16 v9, 0x100

    invoke-direct {v2, v15, v9, v3, v13}, Ld1/d;-><init>(Ljava/lang/String;III)V

    new-instance v9, Ld1/d;

    const-string v15, "ThumbnailImageLength"

    move-object/from16 v48, v2

    const/16 v2, 0x101

    invoke-direct {v9, v15, v2, v3, v13}, Ld1/d;-><init>(Ljava/lang/String;III)V

    new-instance v2, Ld1/d;

    const/16 v13, 0x102

    invoke-direct {v2, v5, v13, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v5, Ld1/d;

    const/16 v13, 0x103

    invoke-direct {v5, v4, v13, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v4, Ld1/d;

    const/16 v13, 0x106

    invoke-direct {v4, v8, v13, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v8, Ld1/d;

    const/16 v13, 0x10e

    const/4 v15, 0x2

    invoke-direct {v8, v0, v13, v15}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v0, Ld1/d;

    const/16 v13, 0x10f

    invoke-direct {v0, v14, v13, v15}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v13, Ld1/d;

    const-string v14, "Model"

    const/16 v3, 0x110

    invoke-direct {v13, v14, v3, v15}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    move-object/from16 v33, v0

    const/16 v0, 0x111

    const/4 v14, 0x3

    const/4 v15, 0x4

    invoke-direct {v3, v7, v0, v14, v15}, Ld1/d;-><init>(Ljava/lang/String;III)V

    new-instance v0, Ld1/d;

    const-string v15, "ThumbnailOrientation"

    move-object/from16 v36, v2

    const/16 v2, 0x112

    invoke-direct {v0, v15, v2, v14}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v2, Ld1/d;

    const-string v15, "SamplesPerPixel"

    move-object/from16 v40, v0

    const/16 v0, 0x115

    invoke-direct {v2, v15, v0, v14}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v0, Ld1/d;

    const-string v15, "RowsPerStrip"

    move-object/from16 v49, v2

    const/16 v2, 0x116

    move-object/from16 v51, v3

    const/4 v3, 0x4

    invoke-direct {v0, v15, v2, v14, v3}, Ld1/d;-><init>(Ljava/lang/String;III)V

    new-instance v2, Ld1/d;

    const-string v15, "StripByteCounts"

    move-object/from16 v52, v0

    const/16 v0, 0x117

    invoke-direct {v2, v15, v0, v14, v3}, Ld1/d;-><init>(Ljava/lang/String;III)V

    new-instance v0, Ld1/d;

    const-string v3, "XResolution"

    const/16 v14, 0x11a

    const/4 v15, 0x5

    invoke-direct {v0, v3, v14, v15}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v14, "YResolution"

    move-object/from16 v53, v0

    const/16 v0, 0x11b

    invoke-direct {v3, v14, v0, v15}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v0, Ld1/d;

    const-string v14, "PlanarConfiguration"

    const/16 v15, 0x11c

    move-object/from16 v54, v2

    const/4 v2, 0x3

    invoke-direct {v0, v14, v15, v2}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v14, Ld1/d;

    const-string v15, "ResolutionUnit"

    move-object/from16 v55, v0

    const/16 v0, 0x128

    invoke-direct {v14, v15, v0, v2}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v0, Ld1/d;

    const-string v15, "TransferFunction"

    move-object/from16 v56, v3

    const/16 v3, 0x12d

    invoke-direct {v0, v15, v3, v2}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v2, Ld1/d;

    const-string v3, "Software"

    const/16 v15, 0x131

    move-object/from16 v57, v0

    const/4 v0, 0x2

    invoke-direct {v2, v3, v15, v0}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v15, "DateTime"

    move-object/from16 v58, v2

    const/16 v2, 0x132

    invoke-direct {v3, v15, v2, v0}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v2, Ld1/d;

    const-string v15, "Artist"

    move-object/from16 v59, v3

    const/16 v3, 0x13b

    invoke-direct {v2, v15, v3, v0}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v0, Ld1/d;

    const-string v3, "WhitePoint"

    const/16 v15, 0x13e

    move-object/from16 v60, v2

    const/4 v2, 0x5

    invoke-direct {v0, v3, v15, v2}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v15, "PrimaryChromaticities"

    move-object/from16 v61, v0

    const/16 v0, 0x13f

    invoke-direct {v3, v15, v0, v2}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v0, Ld1/d;

    const/16 v2, 0x14a

    const/4 v15, 0x4

    invoke-direct {v0, v6, v2, v15}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v2, Ld1/d;

    move-object/from16 v62, v0

    const-string v0, "JPEGInterchangeFormat"

    move-object/from16 v63, v3

    const/16 v3, 0x201

    invoke-direct {v2, v0, v3, v15}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v0, Ld1/d;

    const-string v3, "JPEGInterchangeFormatLength"

    move-object/from16 v64, v2

    const/16 v2, 0x202

    invoke-direct {v0, v3, v2, v15}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v2, Ld1/d;

    const-string v3, "YCbCrCoefficients"

    const/16 v15, 0x211

    move-object/from16 v65, v0

    const/4 v0, 0x5

    invoke-direct {v2, v3, v15, v0}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v0, Ld1/d;

    const-string v3, "YCbCrSubSampling"

    const/16 v15, 0x212

    move-object/from16 v66, v2

    const/4 v2, 0x3

    invoke-direct {v0, v3, v15, v2}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const-string v15, "YCbCrPositioning"

    move-object/from16 v67, v0

    const/16 v0, 0x213

    invoke-direct {v3, v15, v0, v2}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v0, Ld1/d;

    const-string v2, "ReferenceBlackWhite"

    const/16 v15, 0x214

    move-object/from16 v68, v3

    const/4 v3, 0x5

    invoke-direct {v0, v2, v15, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v2, Ld1/d;

    const-string v3, "Copyright"

    const v15, 0x8298

    move-object/from16 v69, v0

    const/4 v0, 0x2

    invoke-direct {v2, v3, v15, v0}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v0, Ld1/d;

    const/4 v3, 0x4

    const v15, 0x8769

    invoke-direct {v0, v12, v15, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v15, Ld1/d;

    move-object/from16 v70, v0

    const v0, 0x8825

    invoke-direct {v15, v1, v0, v3}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v0, Ld1/d;

    const-string v3, "DNGVersion"

    move-object/from16 v71, v2

    const v2, 0xc612

    move-object/from16 v73, v4

    const/4 v4, 0x1

    invoke-direct {v0, v3, v2, v4}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v2, Ld1/d;

    const-string v3, "DefaultCropSize"

    const/16 v21, 0x1

    const v4, 0xc620

    move-object/from16 v74, v0

    move-object/from16 v76, v5

    const/4 v0, 0x3

    const/4 v5, 0x4

    invoke-direct {v2, v3, v4, v0, v5}, Ld1/d;-><init>(Ljava/lang/String;III)V

    const/16 v3, 0x25

    new-array v3, v3, [Ld1/d;

    const/16 v16, 0x0

    aput-object v23, v3, v16

    aput-object v10, v3, v21

    const/16 v27, 0x2

    aput-object v48, v3, v27

    aput-object v9, v3, v0

    aput-object v36, v3, v5

    const/16 v25, 0x5

    aput-object v76, v3, v25

    const/16 v24, 0x6

    aput-object v73, v3, v24

    const/16 v22, 0x7

    aput-object v8, v3, v22

    const/16 v19, 0x8

    aput-object v33, v3, v19

    const/16 v43, 0x9

    aput-object v13, v3, v43

    const/16 v17, 0xa

    aput-object v51, v3, v17

    const/16 v31, 0xb

    aput-object v40, v3, v31

    const/16 v32, 0xc

    aput-object v49, v3, v32

    const/16 v34, 0xd

    aput-object v52, v3, v34

    const/16 v18, 0xe

    aput-object v54, v3, v18

    const/16 v35, 0xf

    aput-object v53, v3, v35

    const/16 v38, 0x10

    aput-object v56, v3, v38

    const/16 v39, 0x11

    aput-object v55, v3, v39

    const/16 v41, 0x12

    aput-object v14, v3, v41

    const/16 v0, 0x13

    aput-object v57, v3, v0

    const/16 v0, 0x14

    aput-object v58, v3, v0

    const/16 v0, 0x15

    aput-object v59, v3, v0

    const/16 v0, 0x16

    aput-object v60, v3, v0

    const/16 v79, 0x17

    aput-object v61, v3, v79

    const/16 v0, 0x18

    aput-object v63, v3, v0

    const/16 v0, 0x19

    aput-object v62, v3, v0

    const/16 v42, 0x1a

    aput-object v64, v3, v42

    const/16 v0, 0x1b

    aput-object v65, v3, v0

    const/16 v0, 0x1c

    aput-object v66, v3, v0

    const/16 v0, 0x1d

    aput-object v67, v3, v0

    const/16 v0, 0x1e

    aput-object v68, v3, v0

    const/16 v0, 0x1f

    aput-object v69, v3, v0

    const/16 v0, 0x20

    aput-object v71, v3, v0

    const/16 v0, 0x21

    aput-object v70, v3, v0

    const/16 v0, 0x22

    aput-object v15, v3, v0

    const/16 v0, 0x23

    aput-object v74, v3, v0

    const/16 v0, 0x24

    aput-object v2, v3, v0

    .line 37
    new-instance v0, Ld1/d;

    const/16 v2, 0x111

    const/4 v9, 0x3

    invoke-direct {v0, v7, v2, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ld1/g;->G:Ld1/d;

    .line 38
    new-instance v0, Ld1/d;

    const-string v2, "ThumbnailImage"

    const/16 v4, 0x100

    const/4 v9, 0x7

    invoke-direct {v0, v2, v4, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v2, Ld1/d;

    const-string v4, "CameraSettingsIFDPointer"

    const/16 v5, 0x2020

    const/4 v15, 0x4

    invoke-direct {v2, v4, v5, v15}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v4, Ld1/d;

    const-string v5, "ImageProcessingIFDPointer"

    const/16 v7, 0x2040

    invoke-direct {v4, v5, v7, v15}, Ld1/d;-><init>(Ljava/lang/String;II)V

    const/4 v9, 0x3

    new-array v5, v9, [Ld1/d;

    const/16 v16, 0x0

    aput-object v0, v5, v16

    const/4 v13, 0x1

    aput-object v2, v5, v13

    const/4 v9, 0x2

    aput-object v4, v5, v9

    .line 39
    new-instance v0, Ld1/d;

    const-string v2, "PreviewImageStart"

    const/16 v4, 0x101

    invoke-direct {v0, v2, v4, v15}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v2, Ld1/d;

    const-string v4, "PreviewImageLength"

    const/16 v7, 0x102

    invoke-direct {v2, v4, v7, v15}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-array v4, v9, [Ld1/d;

    aput-object v0, v4, v16

    aput-object v2, v4, v13

    .line 40
    new-instance v0, Ld1/d;

    const-string v2, "AspectFrame"

    const/16 v7, 0x1113

    const/4 v9, 0x3

    invoke-direct {v0, v2, v7, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-array v2, v13, [Ld1/d;

    aput-object v0, v2, v16

    .line 41
    new-instance v0, Ld1/d;

    const-string v7, "ColorSpace"

    const/16 v8, 0x37

    invoke-direct {v0, v7, v8, v9}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-array v7, v13, [Ld1/d;

    aput-object v0, v7, v16

    const/16 v15, 0xa

    .line 42
    new-array v0, v15, [[Ld1/d;

    aput-object v45, v0, v16

    aput-object v47, v0, v13

    const/16 v27, 0x2

    aput-object v20, v0, v27

    aput-object v11, v0, v9

    const/4 v15, 0x4

    aput-object v3, v0, v15

    const/16 v25, 0x5

    aput-object v45, v0, v25

    const/16 v24, 0x6

    aput-object v5, v0, v24

    const/16 v22, 0x7

    aput-object v4, v0, v22

    const/16 v19, 0x8

    aput-object v2, v0, v19

    const/16 v43, 0x9

    aput-object v7, v0, v43

    sput-object v0, Ld1/g;->H:[[Ld1/d;

    .line 43
    new-instance v0, Ld1/d;

    const/16 v2, 0x14a

    invoke-direct {v0, v6, v2, v15}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v2, Ld1/d;

    const v3, 0x8769

    invoke-direct {v2, v12, v3, v15}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v3, Ld1/d;

    const v4, 0x8825

    invoke-direct {v3, v1, v4, v15}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v1, Ld1/d;

    const-string v4, "InteroperabilityIFDPointer"

    const v5, 0xa005

    invoke-direct {v1, v4, v5, v15}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v4, Ld1/d;

    const-string v5, "CameraSettingsIFDPointer"

    const/16 v6, 0x2020

    const/4 v13, 0x1

    invoke-direct {v4, v5, v6, v13}, Ld1/d;-><init>(Ljava/lang/String;II)V

    new-instance v5, Ld1/d;

    const-string v6, "ImageProcessingIFDPointer"

    const/16 v7, 0x2040

    invoke-direct {v5, v6, v7, v13}, Ld1/d;-><init>(Ljava/lang/String;II)V

    const/4 v6, 0x6

    new-array v6, v6, [Ld1/d;

    const/16 v16, 0x0

    aput-object v0, v6, v16

    aput-object v2, v6, v13

    const/16 v27, 0x2

    aput-object v3, v6, v27

    const/16 v37, 0x3

    aput-object v1, v6, v37

    const/16 v29, 0x4

    aput-object v4, v6, v29

    const/16 v25, 0x5

    aput-object v5, v6, v25

    sput-object v6, Ld1/g;->I:[Ld1/d;

    const/16 v11, 0xa

    .line 44
    new-array v0, v11, [Ljava/util/HashMap;

    sput-object v0, Ld1/g;->J:[Ljava/util/HashMap;

    .line 45
    new-array v0, v11, [Ljava/util/HashMap;

    sput-object v0, Ld1/g;->K:[Ljava/util/HashMap;

    .line 46
    new-instance v0, Ljava/util/HashSet;

    const-string v1, "SubjectDistance"

    const-string v2, "GPSTimeStamp"

    const-string v3, "FNumber"

    const-string v4, "DigitalZoomRatio"

    const-string v5, "ExposureTime"

    filled-new-array {v3, v4, v5, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Ld1/g;->L:Ljava/util/HashSet;

    .line 47
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ld1/g;->M:Ljava/util/HashMap;

    .line 48
    const-string v0, "US-ASCII"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Ld1/g;->N:Ljava/nio/charset/Charset;

    .line 49
    const-string v1, "Exif\u0000\u0000"

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    sput-object v1, Ld1/g;->O:[B

    .line 50
    const-string v1, "http://ns.adobe.com/xap/1.0/\u0000"

    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    sput-object v0, Ld1/g;->P:[B

    .line 52
    new-instance v0, Ljava/text/SimpleDateFormat;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "yyyy:MM:dd HH:mm:ss"

    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 53
    const-string v2, "UTC"

    invoke-static {v2}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 54
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v2, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 55
    const-string v1, "UTC"

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    const/4 v15, 0x0

    .line 56
    :goto_0
    sget-object v0, Ld1/g;->H:[[Ld1/d;

    array-length v1, v0

    if-ge v15, v1, :cond_1

    .line 57
    sget-object v1, Ld1/g;->J:[Ljava/util/HashMap;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    aput-object v2, v1, v15

    .line 58
    sget-object v1, Ld1/g;->K:[Ljava/util/HashMap;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    aput-object v2, v1, v15

    .line 59
    aget-object v0, v0, v15

    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 60
    sget-object v4, Ld1/g;->J:[Ljava/util/HashMap;

    aget-object v4, v4, v15

    iget v5, v3, Ld1/d;->a:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    sget-object v4, Ld1/g;->K:[Ljava/util/HashMap;

    aget-object v4, v4, v15

    iget-object v5, v3, Ld1/d;->b:Ljava/lang/String;

    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v15, v15, 0x1

    goto :goto_0

    .line 62
    :cond_1
    sget-object v0, Ld1/g;->M:Ljava/util/HashMap;

    sget-object v1, Ld1/g;->I:[Ld1/d;

    const/16 v16, 0x0

    aget-object v2, v1, v16

    iget v2, v2, Ld1/d;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v3, v89

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v21, 0x1

    .line 63
    aget-object v2, v1, v21

    iget v2, v2, Ld1/d;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v3, v75

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v27, 0x2

    .line 64
    aget-object v2, v1, v27

    iget v2, v2, Ld1/d;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v3, v72

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v37, 0x3

    .line 65
    aget-object v2, v1, v37

    iget v2, v2, Ld1/d;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v3, v50

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v29, 0x4

    .line 66
    aget-object v2, v1, v29

    iget v2, v2, Ld1/d;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v3, v46

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v25, 0x5

    .line 67
    aget-object v1, v1, v25

    iget v1, v1, Ld1/d;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v44

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    const-string v0, ".*[1-9].*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 69
    const-string v0, "^(\\d{2}):(\\d{2}):(\\d{2})$"

    .line 70
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 71
    const-string v0, "^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"

    .line 72
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 73
    const-string v0, "^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"

    .line 74
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    return-void

    :array_0
    .array-data 1
        -0x1t
        -0x28t
        -0x1t
    .end array-data

    :array_1
    .array-data 1
        0x66t
        0x74t
        0x79t
        0x70t
    .end array-data

    :array_2
    .array-data 1
        0x6dt
        0x69t
        0x66t
        0x31t
    .end array-data

    :array_3
    .array-data 1
        0x68t
        0x65t
        0x69t
        0x63t
    .end array-data

    :array_4
    .array-data 1
        0x4ft
        0x4ct
        0x59t
        0x4dt
        0x50t
        0x0t
    .end array-data

    nop

    :array_5
    .array-data 1
        0x4ft
        0x4ct
        0x59t
        0x4dt
        0x50t
        0x55t
        0x53t
        0x0t
        0x49t
        0x49t
    .end array-data

    nop

    :array_6
    .array-data 1
        -0x77t
        0x50t
        0x4et
        0x47t
        0xdt
        0xat
        0x1at
        0xat
    .end array-data

    :array_7
    .array-data 1
        0x65t
        0x58t
        0x49t
        0x66t
    .end array-data

    :array_8
    .array-data 1
        0x49t
        0x48t
        0x44t
        0x52t
    .end array-data

    :array_9
    .array-data 1
        0x49t
        0x45t
        0x4et
        0x44t
    .end array-data

    :array_a
    .array-data 1
        0x52t
        0x49t
        0x46t
        0x46t
    .end array-data

    :array_b
    .array-data 1
        0x57t
        0x45t
        0x42t
        0x50t
    .end array-data

    :array_c
    .array-data 1
        0x45t
        0x58t
        0x49t
        0x46t
    .end array-data

    :array_d
    .array-data 4
        0x0
        0x1
        0x1
        0x2
        0x4
        0x8
        0x1
        0x1
        0x2
        0x4
        0x8
        0x4
        0x8
        0x1
    .end array-data

    :array_e
    .array-data 1
        0x41t
        0x53t
        0x43t
        0x49t
        0x49t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ld1/g;->H:[[Ld1/d;

    .line 5
    .line 6
    array-length v1, v0

    .line 7
    new-array v1, v1, [Ljava/util/HashMap;

    .line 8
    .line 9
    iput-object v1, p0, Ld1/g;->d:[Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v1, Ljava/util/HashSet;

    .line 12
    .line 13
    array-length v2, v0

    .line 14
    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Ld1/g;->e:Ljava/util/HashSet;

    .line 18
    .line 19
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 20
    .line 21
    iput-object v1, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 22
    .line 23
    instance-of v1, p1, Landroid/content/res/AssetManager$AssetInputStream;

    .line 24
    .line 25
    sget-boolean v2, Ld1/g;->l:Z

    .line 26
    .line 27
    const-string v3, "ExifInterface"

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    move-object v1, p1

    .line 33
    check-cast v1, Landroid/content/res/AssetManager$AssetInputStream;

    .line 34
    .line 35
    iput-object v1, p0, Ld1/g;->b:Landroid/content/res/AssetManager$AssetInputStream;

    .line 36
    .line 37
    iput-object v4, p0, Ld1/g;->a:Ljava/io/FileDescriptor;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    instance-of v1, p1, Ljava/io/FileInputStream;

    .line 41
    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    move-object v1, p1

    .line 45
    check-cast v1, Ljava/io/FileInputStream;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    :try_start_0
    sget v6, Landroid/system/OsConstants;->SEEK_CUR:I

    .line 52
    .line 53
    const-wide/16 v7, 0x0

    .line 54
    .line 55
    invoke-static {v5, v7, v8, v6}, Ld1/h;->c(Ljava/io/FileDescriptor;JI)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    .line 58
    iput-object v4, p0, Ld1/g;->b:Landroid/content/res/AssetManager$AssetInputStream;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iput-object v1, p0, Ld1/g;->a:Ljava/io/FileDescriptor;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catch_0
    nop

    .line 68
    if-eqz v2, :cond_1

    .line 69
    .line 70
    const-string v1, "The file descriptor for the given input is not seekable"

    .line 71
    .line 72
    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    :cond_1
    iput-object v4, p0, Ld1/g;->b:Landroid/content/res/AssetManager$AssetInputStream;

    .line 76
    .line 77
    iput-object v4, p0, Ld1/g;->a:Ljava/io/FileDescriptor;

    .line 78
    .line 79
    :goto_0
    const/4 v1, 0x0

    .line 80
    const/4 v4, 0x0

    .line 81
    :goto_1
    :try_start_1
    array-length v5, v0

    .line 82
    if-ge v4, v5, :cond_2

    .line 83
    .line 84
    iget-object v5, p0, Ld1/g;->d:[Ljava/util/HashMap;

    .line 85
    .line 86
    new-instance v6, Ljava/util/HashMap;

    .line 87
    .line 88
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 89
    .line 90
    .line 91
    aput-object v6, v5, v4

    .line 92
    .line 93
    add-int/lit8 v4, v4, 0x1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :catchall_0
    move-exception p1

    .line 97
    goto/16 :goto_7

    .line 98
    .line 99
    :catch_1
    move-exception p1

    .line 100
    goto/16 :goto_6

    .line 101
    .line 102
    :catch_2
    move-exception p1

    .line 103
    goto/16 :goto_6

    .line 104
    .line 105
    :cond_2
    new-instance v0, Ljava/io/BufferedInputStream;

    .line 106
    .line 107
    const/16 v4, 0x1388

    .line 108
    .line 109
    invoke-direct {v0, p1, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v0}, Ld1/g;->g(Ljava/io/BufferedInputStream;)I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    iput p1, p0, Ld1/g;->c:I

    .line 117
    .line 118
    const/16 v4, 0xe

    .line 119
    .line 120
    const/16 v5, 0xd

    .line 121
    .line 122
    const/16 v6, 0x9

    .line 123
    .line 124
    const/4 v7, 0x4

    .line 125
    if-eq p1, v7, :cond_7

    .line 126
    .line 127
    if-eq p1, v6, :cond_7

    .line 128
    .line 129
    if-eq p1, v5, :cond_7

    .line 130
    .line 131
    if-ne p1, v4, :cond_3

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_3
    new-instance p1, Ld1/f;

    .line 135
    .line 136
    invoke-direct {p1, v0}, Ld1/f;-><init>(Ljava/io/InputStream;)V

    .line 137
    .line 138
    .line 139
    iget v0, p0, Ld1/g;->c:I

    .line 140
    .line 141
    const/16 v1, 0xc

    .line 142
    .line 143
    if-ne v0, v1, :cond_4

    .line 144
    .line 145
    invoke-virtual {p0, p1}, Ld1/g;->e(Ld1/f;)V

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_4
    const/4 v1, 0x7

    .line 150
    if-ne v0, v1, :cond_5

    .line 151
    .line 152
    invoke-virtual {p0, p1}, Ld1/g;->h(Ld1/f;)V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_5
    const/16 v1, 0xa

    .line 157
    .line 158
    if-ne v0, v1, :cond_6

    .line 159
    .line 160
    invoke-virtual {p0, p1}, Ld1/g;->l(Ld1/f;)V

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_6
    invoke-virtual {p0, p1}, Ld1/g;->k(Ld1/f;)V

    .line 165
    .line 166
    .line 167
    :goto_2
    iget v0, p0, Ld1/g;->h:I

    .line 168
    .line 169
    int-to-long v0, v0

    .line 170
    invoke-virtual {p1, v0, v1}, Ld1/f;->b(J)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, p1}, Ld1/g;->v(Ld1/b;)V

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_7
    :goto_3
    new-instance p1, Ld1/b;

    .line 178
    .line 179
    invoke-direct {p1, v0}, Ld1/b;-><init>(Ljava/io/InputStream;)V

    .line 180
    .line 181
    .line 182
    iget v0, p0, Ld1/g;->c:I

    .line 183
    .line 184
    if-ne v0, v7, :cond_8

    .line 185
    .line 186
    invoke-virtual {p0, p1, v1, v1}, Ld1/g;->f(Ld1/b;II)V

    .line 187
    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_8
    if-ne v0, v5, :cond_9

    .line 191
    .line 192
    invoke-virtual {p0, p1}, Ld1/g;->i(Ld1/b;)V

    .line 193
    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_9
    if-ne v0, v6, :cond_a

    .line 197
    .line 198
    invoke-virtual {p0, p1}, Ld1/g;->j(Ld1/b;)V

    .line 199
    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_a
    if-ne v0, v4, :cond_b

    .line 203
    .line 204
    invoke-virtual {p0, p1}, Ld1/g;->m(Ld1/b;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 205
    .line 206
    .line 207
    :cond_b
    :goto_4
    invoke-virtual {p0}, Ld1/g;->a()V

    .line 208
    .line 209
    .line 210
    if-eqz v2, :cond_e

    .line 211
    .line 212
    :goto_5
    invoke-virtual {p0}, Ld1/g;->q()V

    .line 213
    .line 214
    .line 215
    goto :goto_9

    .line 216
    :goto_6
    if-eqz v2, :cond_d

    .line 217
    .line 218
    :try_start_2
    const-string v0, "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."

    .line 219
    .line 220
    invoke-static {v3, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 221
    .line 222
    .line 223
    goto :goto_8

    .line 224
    :goto_7
    invoke-virtual {p0}, Ld1/g;->a()V

    .line 225
    .line 226
    .line 227
    if-eqz v2, :cond_c

    .line 228
    .line 229
    invoke-virtual {p0}, Ld1/g;->q()V

    .line 230
    .line 231
    .line 232
    :cond_c
    throw p1

    .line 233
    :cond_d
    :goto_8
    invoke-virtual {p0}, Ld1/g;->a()V

    .line 234
    .line 235
    .line 236
    if-eqz v2, :cond_e

    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_e
    :goto_9
    return-void
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
.end method

.method public static r(Ld1/b;)Ljava/nio/ByteOrder;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ld1/b;->readShort()S

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x4949

    .line 6
    .line 7
    const-string v1, "ExifInterface"

    .line 8
    .line 9
    sget-boolean v2, Ld1/g;->l:Z

    .line 10
    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    .line 13
    const/16 v0, 0x4d4d

    .line 14
    .line 15
    if-ne p0, v0, :cond_1

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    const-string p0, "readExifSegment: Byte Align MM"

    .line 20
    .line 21
    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    sget-object p0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v2, "Invalid byte order: "

    .line 32
    .line 33
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :cond_2
    if-eqz v2, :cond_3

    .line 52
    .line 53
    const-string p0, "readExifSegment: Byte Align II"

    .line 54
    .line 55
    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    :cond_3
    sget-object p0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 59
    .line 60
    return-object p0
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
.end method


# virtual methods
.method public final a()V
    .locals 8

    .line 1
    const-string v0, "DateTimeOriginal"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ld1/g;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    iget-object v2, p0, Ld1/g;->d:[Ljava/util/HashMap;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-string v3, "DateTime"

    .line 13
    .line 14
    invoke-virtual {p0, v3}, Ld1/g;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    if-nez v4, :cond_0

    .line 19
    .line 20
    aget-object v4, v2, v1

    .line 21
    .line 22
    const-string v5, "\u0000"

    .line 23
    .line 24
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v5, Ld1/g;->N:Ljava/nio/charset/Charset;

    .line 29
    .line 30
    invoke-virtual {v0, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v5, Ld1/c;

    .line 35
    .line 36
    const/4 v6, 0x2

    .line 37
    array-length v7, v0

    .line 38
    invoke-direct {v5, v0, v6, v7}, Ld1/c;-><init>([BII)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_0
    const-string v0, "ImageWidth"

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Ld1/g;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const-wide/16 v4, 0x0

    .line 51
    .line 52
    if-nez v3, :cond_1

    .line 53
    .line 54
    aget-object v3, v2, v1

    .line 55
    .line 56
    iget-object v6, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 57
    .line 58
    invoke-static {v4, v5, v6}, Ld1/c;->a(JLjava/nio/ByteOrder;)Ld1/c;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-virtual {v3, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    :cond_1
    const-string v0, "ImageLength"

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Ld1/g;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    if-nez v3, :cond_2

    .line 72
    .line 73
    aget-object v3, v2, v1

    .line 74
    .line 75
    iget-object v6, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 76
    .line 77
    invoke-static {v4, v5, v6}, Ld1/c;->a(JLjava/nio/ByteOrder;)Ld1/c;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {v3, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    :cond_2
    const-string v0, "Orientation"

    .line 85
    .line 86
    invoke-virtual {p0, v0}, Ld1/g;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    if-nez v3, :cond_3

    .line 91
    .line 92
    aget-object v1, v2, v1

    .line 93
    .line 94
    iget-object v3, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 95
    .line 96
    invoke-static {v4, v5, v3}, Ld1/c;->a(JLjava/nio/ByteOrder;)Ld1/c;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    :cond_3
    const-string v0, "LightSource"

    .line 104
    .line 105
    invoke-virtual {p0, v0}, Ld1/g;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    if-nez v1, :cond_4

    .line 110
    .line 111
    const/4 v1, 0x1

    .line 112
    aget-object v1, v2, v1

    .line 113
    .line 114
    iget-object v2, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 115
    .line 116
    invoke-static {v4, v5, v2}, Ld1/c;->a(JLjava/nio/ByteOrder;)Ld1/c;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    :cond_4
    return-void
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

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    invoke-virtual {p0, p1}, Ld1/g;->d(Ljava/lang/String;)Ld1/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    iget v2, v0, Ld1/c;->a:I

    .line 9
    .line 10
    sget-object v3, Ld1/g;->L:Ljava/util/HashSet;

    .line 11
    .line 12
    invoke-virtual {v3, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ld1/c;->f(Ljava/nio/ByteOrder;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :cond_0
    const-string v3, "GPSTimeStamp"

    .line 26
    .line 27
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_4

    .line 32
    .line 33
    const/4 p1, 0x5

    .line 34
    const-string v3, "ExifInterface"

    .line 35
    .line 36
    if-eq v2, p1, :cond_1

    .line 37
    .line 38
    const/16 p1, 0xa

    .line 39
    .line 40
    if-eq v2, p1, :cond_1

    .line 41
    .line 42
    new-instance p1, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v0, "GPS Timestamp format is not rational. format="

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_1
    iget-object p1, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ld1/c;->g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, [Ld1/e;

    .line 67
    .line 68
    if-eqz p1, :cond_3

    .line 69
    .line 70
    array-length v0, p1

    .line 71
    const/4 v2, 0x3

    .line 72
    if-eq v0, v2, :cond_2

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    const/4 v0, 0x0

    .line 76
    aget-object v1, p1, v0

    .line 77
    .line 78
    iget-wide v3, v1, Ld1/e;->a:J

    .line 79
    .line 80
    long-to-float v3, v3

    .line 81
    iget-wide v4, v1, Ld1/e;->b:J

    .line 82
    .line 83
    long-to-float v1, v4

    .line 84
    div-float/2addr v3, v1

    .line 85
    float-to-int v1, v3

    .line 86
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const/4 v3, 0x1

    .line 91
    aget-object v4, p1, v3

    .line 92
    .line 93
    iget-wide v5, v4, Ld1/e;->a:J

    .line 94
    .line 95
    long-to-float v5, v5

    .line 96
    iget-wide v6, v4, Ld1/e;->b:J

    .line 97
    .line 98
    long-to-float v4, v6

    .line 99
    div-float/2addr v5, v4

    .line 100
    float-to-int v4, v5

    .line 101
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    const/4 v5, 0x2

    .line 106
    aget-object p1, p1, v5

    .line 107
    .line 108
    iget-wide v6, p1, Ld1/e;->a:J

    .line 109
    .line 110
    long-to-float v6, v6

    .line 111
    iget-wide v7, p1, Ld1/e;->b:J

    .line 112
    .line 113
    long-to-float p1, v7

    .line 114
    div-float/2addr v6, p1

    .line 115
    float-to-int p1, v6

    .line 116
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    new-array v2, v2, [Ljava/lang/Object;

    .line 121
    .line 122
    aput-object v1, v2, v0

    .line 123
    .line 124
    aput-object v4, v2, v3

    .line 125
    .line 126
    aput-object p1, v2, v5

    .line 127
    .line 128
    const-string p1, "%02d:%02d:%02d"

    .line 129
    .line 130
    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    return-object p1

    .line 135
    :cond_3
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    const-string v2, "Invalid GPS Timestamp array. array="

    .line 138
    .line 139
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    return-object v1

    .line 157
    :cond_4
    :try_start_0
    iget-object p1, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 158
    .line 159
    invoke-virtual {v0, p1}, Ld1/c;->d(Ljava/nio/ByteOrder;)D

    .line 160
    .line 161
    .line 162
    move-result-wide v2

    .line 163
    invoke-static {v2, v3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 167
    return-object p1

    .line 168
    :catch_0
    :cond_5
    return-object v1
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
.end method

.method public final c()I
    .locals 2

    .line 1
    const-string v0, "Orientation"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ld1/g;->d(Ljava/lang/String;)Ld1/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    :try_start_0
    iget-object v1, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ld1/c;->e(Ljava/nio/ByteOrder;)I

    .line 13
    .line 14
    .line 15
    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return v0

    .line 17
    :catch_0
    :goto_0
    const/4 v0, 0x1

    .line 18
    return v0
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

.method public final d(Ljava/lang/String;)Ld1/c;
    .locals 2

    .line 1
    const-string v0, "ISOSpeedRatings"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    sget-boolean p1, Ld1/g;->l:Z

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const-string p1, "ExifInterface"

    .line 14
    .line 15
    const-string v0, "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."

    .line 16
    .line 17
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    :cond_0
    const-string p1, "PhotographicSensitivity"

    .line 21
    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    :goto_0
    sget-object v1, Ld1/g;->H:[[Ld1/d;

    .line 24
    .line 25
    array-length v1, v1

    .line 26
    if-ge v0, v1, :cond_3

    .line 27
    .line 28
    iget-object v1, p0, Ld1/g;->d:[Ljava/util/HashMap;

    .line 29
    .line 30
    aget-object v1, v1, v0

    .line 31
    .line 32
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ld1/c;

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    return-object v1

    .line 41
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    const/4 p1, 0x0

    .line 45
    return-object p1
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
.end method

.method public final e(Ld1/f;)V
    .locals 13

    .line 1
    const-string v0, "yes"

    .line 2
    .line 3
    const-string v1, "Heif meta: "

    .line 4
    .line 5
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v3, 0x1c

    .line 8
    .line 9
    if-lt v2, v3, :cond_c

    .line 10
    .line 11
    new-instance v2, Landroid/media/MediaMetadataRetriever;

    .line 12
    .line 13
    invoke-direct {v2}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    new-instance v3, Ld1/a;

    .line 17
    .line 18
    invoke-direct {v3, p1}, Ld1/a;-><init>(Ld1/f;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v2, v3}, Ld1/i;->a(Landroid/media/MediaMetadataRetriever;Landroid/media/MediaDataSource;)V

    .line 22
    .line 23
    .line 24
    const/16 v3, 0x21

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const/16 v4, 0x22

    .line 31
    .line 32
    invoke-virtual {v2, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const/16 v5, 0x1a

    .line 37
    .line 38
    invoke-virtual {v2, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    const/16 v6, 0x11

    .line 43
    .line 44
    invoke-virtual {v2, v6}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_0

    .line 53
    .line 54
    const/16 v0, 0x1d

    .line 55
    .line 56
    invoke-virtual {v2, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const/16 v5, 0x1e

    .line 61
    .line 62
    invoke-virtual {v2, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    const/16 v6, 0x1f

    .line 67
    .line 68
    invoke-virtual {v2, v6}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception p1

    .line 74
    goto/16 :goto_3

    .line 75
    .line 76
    :cond_0
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_1

    .line 81
    .line 82
    const/16 v0, 0x12

    .line 83
    .line 84
    invoke-virtual {v2, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const/16 v5, 0x13

    .line 89
    .line 90
    invoke-virtual {v2, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    const/16 v6, 0x18

    .line 95
    .line 96
    invoke-virtual {v2, v6}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v6
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    goto :goto_0

    .line 101
    :cond_1
    const/4 v0, 0x0

    .line 102
    move-object v5, v0

    .line 103
    move-object v6, v5

    .line 104
    :goto_0
    iget-object v7, p0, Ld1/g;->d:[Ljava/util/HashMap;

    .line 105
    .line 106
    const/4 v8, 0x0

    .line 107
    if-eqz v0, :cond_2

    .line 108
    .line 109
    :try_start_1
    aget-object v9, v7, v8

    .line 110
    .line 111
    const-string v10, "ImageWidth"

    .line 112
    .line 113
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    move-result v11

    .line 117
    iget-object v12, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 118
    .line 119
    invoke-static {v11, v12}, Ld1/c;->c(ILjava/nio/ByteOrder;)Ld1/c;

    .line 120
    .line 121
    .line 122
    move-result-object v11

    .line 123
    invoke-virtual {v9, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    :cond_2
    if-eqz v5, :cond_3

    .line 127
    .line 128
    aget-object v9, v7, v8

    .line 129
    .line 130
    const-string v10, "ImageLength"

    .line 131
    .line 132
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    iget-object v12, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 137
    .line 138
    invoke-static {v11, v12}, Ld1/c;->c(ILjava/nio/ByteOrder;)Ld1/c;

    .line 139
    .line 140
    .line 141
    move-result-object v11

    .line 142
    invoke-virtual {v9, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    :cond_3
    const/4 v9, 0x6

    .line 146
    if-eqz v6, :cond_7

    .line 147
    .line 148
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    const/16 v11, 0x5a

    .line 153
    .line 154
    if-eq v10, v11, :cond_6

    .line 155
    .line 156
    const/16 v11, 0xb4

    .line 157
    .line 158
    if-eq v10, v11, :cond_5

    .line 159
    .line 160
    const/16 v11, 0x10e

    .line 161
    .line 162
    if-eq v10, v11, :cond_4

    .line 163
    .line 164
    const/4 v10, 0x1

    .line 165
    goto :goto_1

    .line 166
    :cond_4
    const/16 v10, 0x8

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_5
    const/4 v10, 0x3

    .line 170
    goto :goto_1

    .line 171
    :cond_6
    const/4 v10, 0x6

    .line 172
    :goto_1
    aget-object v7, v7, v8

    .line 173
    .line 174
    const-string v11, "Orientation"

    .line 175
    .line 176
    iget-object v12, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 177
    .line 178
    invoke-static {v10, v12}, Ld1/c;->c(ILjava/nio/ByteOrder;)Ld1/c;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    invoke-virtual {v7, v11, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    :cond_7
    if-eqz v3, :cond_a

    .line 186
    .line 187
    if-eqz v4, :cond_a

    .line 188
    .line 189
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    if-le v4, v9, :cond_9

    .line 198
    .line 199
    int-to-long v10, v3

    .line 200
    invoke-virtual {p1, v10, v11}, Ld1/f;->b(J)V

    .line 201
    .line 202
    .line 203
    new-array v7, v9, [B

    .line 204
    .line 205
    invoke-virtual {p1, v7}, Ld1/b;->readFully([B)V

    .line 206
    .line 207
    .line 208
    add-int/2addr v3, v9

    .line 209
    add-int/lit8 v4, v4, -0x6

    .line 210
    .line 211
    sget-object v9, Ld1/g;->O:[B

    .line 212
    .line 213
    invoke-static {v7, v9}, Ljava/util/Arrays;->equals([B[B)Z

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    if-eqz v7, :cond_8

    .line 218
    .line 219
    new-array v4, v4, [B

    .line 220
    .line 221
    invoke-virtual {p1, v4}, Ld1/b;->readFully([B)V

    .line 222
    .line 223
    .line 224
    iput v3, p0, Ld1/g;->h:I

    .line 225
    .line 226
    invoke-virtual {p0, v8, v4}, Ld1/g;->s(I[B)V

    .line 227
    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_8
    new-instance p1, Ljava/io/IOException;

    .line 231
    .line 232
    const-string v0, "Invalid identifier"

    .line 233
    .line 234
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    throw p1

    .line 238
    :cond_9
    new-instance p1, Ljava/io/IOException;

    .line 239
    .line 240
    const-string v0, "Invalid exif length"

    .line 241
    .line 242
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    throw p1

    .line 246
    :cond_a
    :goto_2
    sget-boolean p1, Ld1/g;->l:Z

    .line 247
    .line 248
    if-eqz p1, :cond_b

    .line 249
    .line 250
    const-string p1, "ExifInterface"

    .line 251
    .line 252
    new-instance v3, Ljava/lang/StringBuilder;

    .line 253
    .line 254
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    const-string v0, "x"

    .line 261
    .line 262
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    const-string v0, ", rotation "

    .line 269
    .line 270
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 281
    .line 282
    .line 283
    :cond_b
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 284
    .line 285
    .line 286
    return-void

    .line 287
    :catch_0
    :try_start_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 288
    .line 289
    const-string v0, "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."

    .line 290
    .line 291
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 295
    :goto_3
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 296
    .line 297
    .line 298
    throw p1

    .line 299
    :cond_c
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 300
    .line 301
    const-string v0, "Reading EXIF from HEIF files is supported from SDK 28 and above"

    .line 302
    .line 303
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    throw p1
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
.end method

.method public final f(Ld1/b;II)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    const-string v3, "ExifInterface"

    .line 8
    .line 9
    sget-boolean v4, Ld1/g;->l:Z

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    new-instance v5, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v6, "getJpegAttributes starting with: "

    .line 16
    .line 17
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-static {v3, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object v5, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 31
    .line 32
    iput-object v5, v1, Ld1/b;->j:Ljava/nio/ByteOrder;

    .line 33
    .line 34
    invoke-virtual {v1}, Ld1/b;->readByte()B

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    const-string v6, "Invalid marker: "

    .line 39
    .line 40
    const/4 v7, -0x1

    .line 41
    if-ne v5, v7, :cond_17

    .line 42
    .line 43
    invoke-virtual {v1}, Ld1/b;->readByte()B

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    const/16 v9, -0x28

    .line 48
    .line 49
    if-ne v8, v9, :cond_16

    .line 50
    .line 51
    const/4 v5, 0x2

    .line 52
    const/4 v6, 0x2

    .line 53
    :goto_0
    invoke-virtual {v1}, Ld1/b;->readByte()B

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    if-ne v8, v7, :cond_15

    .line 58
    .line 59
    invoke-virtual {v1}, Ld1/b;->readByte()B

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-eqz v4, :cond_1

    .line 64
    .line 65
    new-instance v9, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v10, "Found JPEG segment indicator: "

    .line 68
    .line 69
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    and-int/lit16 v10, v8, 0xff

    .line 73
    .line 74
    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    invoke-static {v3, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    :cond_1
    const/16 v9, -0x27

    .line 89
    .line 90
    if-eq v8, v9, :cond_14

    .line 91
    .line 92
    const/16 v9, -0x26

    .line 93
    .line 94
    if-ne v8, v9, :cond_2

    .line 95
    .line 96
    goto/16 :goto_9

    .line 97
    .line 98
    :cond_2
    invoke-virtual {v1}, Ld1/b;->readUnsignedShort()I

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    add-int/lit8 v10, v9, -0x2

    .line 103
    .line 104
    const/4 v11, 0x4

    .line 105
    add-int/2addr v6, v11

    .line 106
    if-eqz v4, :cond_3

    .line 107
    .line 108
    new-instance v12, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    const-string v13, "JPEG segment: "

    .line 111
    .line 112
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    and-int/lit16 v13, v8, 0xff

    .line 116
    .line 117
    invoke-static {v13}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v13

    .line 121
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v13, " (length: "

    .line 125
    .line 126
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v13, ")"

    .line 133
    .line 134
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    invoke-static {v3, v12}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    :cond_3
    const-string v12, "Invalid length"

    .line 145
    .line 146
    if-ltz v10, :cond_13

    .line 147
    .line 148
    const/16 v13, -0x1f

    .line 149
    .line 150
    const/4 v14, 0x0

    .line 151
    iget-object v15, v0, Ld1/g;->d:[Ljava/util/HashMap;

    .line 152
    .line 153
    if-eq v8, v13, :cond_8

    .line 154
    .line 155
    const/4 v13, -0x2

    .line 156
    const/4 v7, 0x1

    .line 157
    if-eq v8, v13, :cond_6

    .line 158
    .line 159
    packed-switch v8, :pswitch_data_0

    .line 160
    .line 161
    .line 162
    packed-switch v8, :pswitch_data_1

    .line 163
    .line 164
    .line 165
    packed-switch v8, :pswitch_data_2

    .line 166
    .line 167
    .line 168
    packed-switch v8, :pswitch_data_3

    .line 169
    .line 170
    .line 171
    goto/16 :goto_8

    .line 172
    .line 173
    :pswitch_0
    invoke-virtual {v1, v7}, Ld1/b;->a(I)V

    .line 174
    .line 175
    .line 176
    aget-object v7, v15, v2

    .line 177
    .line 178
    if-eq v2, v11, :cond_4

    .line 179
    .line 180
    const-string v8, "ImageLength"

    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_4
    const-string v8, "ThumbnailImageLength"

    .line 184
    .line 185
    :goto_1
    invoke-virtual {v1}, Ld1/b;->readUnsignedShort()I

    .line 186
    .line 187
    .line 188
    move-result v10

    .line 189
    int-to-long v13, v10

    .line 190
    iget-object v10, v0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 191
    .line 192
    invoke-static {v13, v14, v10}, Ld1/c;->a(JLjava/nio/ByteOrder;)Ld1/c;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    invoke-virtual {v7, v8, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    aget-object v7, v15, v2

    .line 200
    .line 201
    if-eq v2, v11, :cond_5

    .line 202
    .line 203
    const-string v8, "ImageWidth"

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_5
    const-string v8, "ThumbnailImageWidth"

    .line 207
    .line 208
    :goto_2
    invoke-virtual {v1}, Ld1/b;->readUnsignedShort()I

    .line 209
    .line 210
    .line 211
    move-result v10

    .line 212
    int-to-long v10, v10

    .line 213
    iget-object v13, v0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 214
    .line 215
    invoke-static {v10, v11, v13}, Ld1/c;->a(JLjava/nio/ByteOrder;)Ld1/c;

    .line 216
    .line 217
    .line 218
    move-result-object v10

    .line 219
    invoke-virtual {v7, v8, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    add-int/lit8 v10, v9, -0x7

    .line 223
    .line 224
    goto/16 :goto_8

    .line 225
    .line 226
    :cond_6
    new-array v8, v10, [B

    .line 227
    .line 228
    invoke-virtual {v1, v8}, Ld1/b;->readFully([B)V

    .line 229
    .line 230
    .line 231
    const-string v9, "UserComment"

    .line 232
    .line 233
    invoke-virtual {v0, v9}, Ld1/g;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v10

    .line 237
    if-nez v10, :cond_7

    .line 238
    .line 239
    aget-object v7, v15, v7

    .line 240
    .line 241
    new-instance v10, Ljava/lang/String;

    .line 242
    .line 243
    sget-object v11, Ld1/g;->N:Ljava/nio/charset/Charset;

    .line 244
    .line 245
    invoke-direct {v10, v8, v11}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 246
    .line 247
    .line 248
    const-string v8, "\u0000"

    .line 249
    .line 250
    invoke-virtual {v10, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v8

    .line 254
    invoke-virtual {v8, v11}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 255
    .line 256
    .line 257
    move-result-object v8

    .line 258
    new-instance v10, Ld1/c;

    .line 259
    .line 260
    array-length v11, v8

    .line 261
    invoke-direct {v10, v8, v5, v11}, Ld1/c;-><init>([BII)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v7, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    :cond_7
    :goto_3
    const/4 v10, 0x0

    .line 268
    goto/16 :goto_8

    .line 269
    .line 270
    :cond_8
    new-array v7, v10, [B

    .line 271
    .line 272
    invoke-virtual {v1, v7}, Ld1/b;->readFully([B)V

    .line 273
    .line 274
    .line 275
    add-int v8, v6, v10

    .line 276
    .line 277
    sget-object v9, Ld1/g;->O:[B

    .line 278
    .line 279
    if-nez v9, :cond_9

    .line 280
    .line 281
    goto :goto_5

    .line 282
    :cond_9
    array-length v11, v9

    .line 283
    if-ge v10, v11, :cond_a

    .line 284
    .line 285
    goto :goto_5

    .line 286
    :cond_a
    const/4 v11, 0x0

    .line 287
    :goto_4
    array-length v13, v9

    .line 288
    if-ge v11, v13, :cond_10

    .line 289
    .line 290
    aget-byte v13, v7, v11

    .line 291
    .line 292
    aget-byte v5, v9, v11

    .line 293
    .line 294
    if-eq v13, v5, :cond_f

    .line 295
    .line 296
    :goto_5
    sget-object v5, Ld1/g;->P:[B

    .line 297
    .line 298
    if-nez v5, :cond_b

    .line 299
    .line 300
    goto :goto_7

    .line 301
    :cond_b
    array-length v9, v5

    .line 302
    if-ge v10, v9, :cond_c

    .line 303
    .line 304
    goto :goto_7

    .line 305
    :cond_c
    const/4 v9, 0x0

    .line 306
    :goto_6
    array-length v11, v5

    .line 307
    if-ge v9, v11, :cond_e

    .line 308
    .line 309
    aget-byte v11, v7, v9

    .line 310
    .line 311
    aget-byte v13, v5, v9

    .line 312
    .line 313
    if-eq v11, v13, :cond_d

    .line 314
    .line 315
    goto :goto_7

    .line 316
    :cond_d
    add-int/lit8 v9, v9, 0x1

    .line 317
    .line 318
    goto :goto_6

    .line 319
    :cond_e
    array-length v9, v5

    .line 320
    add-int/2addr v6, v9

    .line 321
    array-length v5, v5

    .line 322
    invoke-static {v7, v5, v10}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    const-string v7, "Xmp"

    .line 327
    .line 328
    invoke-virtual {v0, v7}, Ld1/g;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v9

    .line 332
    if-nez v9, :cond_11

    .line 333
    .line 334
    aget-object v9, v15, v14

    .line 335
    .line 336
    new-instance v16, Ld1/c;

    .line 337
    .line 338
    array-length v10, v5

    .line 339
    int-to-long v14, v6

    .line 340
    const/16 v20, 0x1

    .line 341
    .line 342
    move-object/from16 v19, v5

    .line 343
    .line 344
    move/from16 v21, v10

    .line 345
    .line 346
    move-wide/from16 v17, v14

    .line 347
    .line 348
    invoke-direct/range {v16 .. v21}, Ld1/c;-><init>(J[BII)V

    .line 349
    .line 350
    .line 351
    move-object/from16 v5, v16

    .line 352
    .line 353
    invoke-virtual {v9, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    goto :goto_7

    .line 357
    :cond_f
    add-int/lit8 v11, v11, 0x1

    .line 358
    .line 359
    const/4 v5, 0x2

    .line 360
    const/4 v14, 0x0

    .line 361
    goto :goto_4

    .line 362
    :cond_10
    array-length v5, v9

    .line 363
    invoke-static {v7, v5, v10}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 364
    .line 365
    .line 366
    move-result-object v5

    .line 367
    add-int v6, p2, v6

    .line 368
    .line 369
    array-length v7, v9

    .line 370
    add-int/2addr v6, v7

    .line 371
    iput v6, v0, Ld1/g;->h:I

    .line 372
    .line 373
    invoke-virtual {v0, v2, v5}, Ld1/g;->s(I[B)V

    .line 374
    .line 375
    .line 376
    new-instance v6, Ld1/b;

    .line 377
    .line 378
    invoke-direct {v6, v5}, Ld1/b;-><init>([B)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0, v6}, Ld1/g;->v(Ld1/b;)V

    .line 382
    .line 383
    .line 384
    :cond_11
    :goto_7
    move v6, v8

    .line 385
    goto :goto_3

    .line 386
    :goto_8
    if-ltz v10, :cond_12

    .line 387
    .line 388
    invoke-virtual {v1, v10}, Ld1/b;->a(I)V

    .line 389
    .line 390
    .line 391
    add-int/2addr v6, v10

    .line 392
    const/4 v5, 0x2

    .line 393
    const/4 v7, -0x1

    .line 394
    goto/16 :goto_0

    .line 395
    .line 396
    :cond_12
    new-instance v1, Ljava/io/IOException;

    .line 397
    .line 398
    invoke-direct {v1, v12}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    throw v1

    .line 402
    :cond_13
    new-instance v1, Ljava/io/IOException;

    .line 403
    .line 404
    invoke-direct {v1, v12}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    throw v1

    .line 408
    :cond_14
    :goto_9
    iget-object v2, v0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 409
    .line 410
    iput-object v2, v1, Ld1/b;->j:Ljava/nio/ByteOrder;

    .line 411
    .line 412
    return-void

    .line 413
    :cond_15
    new-instance v1, Ljava/io/IOException;

    .line 414
    .line 415
    new-instance v2, Ljava/lang/StringBuilder;

    .line 416
    .line 417
    const-string v3, "Invalid marker:"

    .line 418
    .line 419
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    and-int/lit16 v3, v8, 0xff

    .line 423
    .line 424
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v2

    .line 435
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    throw v1

    .line 439
    :cond_16
    new-instance v1, Ljava/io/IOException;

    .line 440
    .line 441
    new-instance v2, Ljava/lang/StringBuilder;

    .line 442
    .line 443
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    and-int/lit16 v3, v5, 0xff

    .line 447
    .line 448
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    throw v1

    .line 463
    :cond_17
    new-instance v1, Ljava/io/IOException;

    .line 464
    .line 465
    new-instance v2, Ljava/lang/StringBuilder;

    .line 466
    .line 467
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    and-int/lit16 v3, v5, 0xff

    .line 471
    .line 472
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v3

    .line 476
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    throw v1

    .line 487
    :pswitch_data_0
    .packed-switch -0x40
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    :pswitch_data_1
    .packed-switch -0x3b
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    :pswitch_data_2
    .packed-switch -0x37
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    :pswitch_data_3
    .packed-switch -0x33
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
.end method

.method public final g(Ljava/io/BufferedInputStream;)I
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/16 v2, 0x1388

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Ljava/io/BufferedInputStream;->mark(I)V

    .line 8
    .line 9
    .line 10
    new-array v3, v2, [B

    .line 11
    .line 12
    invoke-virtual {v0, v3}, Ljava/io/InputStream;->read([B)I

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->reset()V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    :goto_0
    sget-object v5, Ld1/g;->q:[B

    .line 20
    .line 21
    array-length v6, v5

    .line 22
    const/4 v7, 0x4

    .line 23
    if-ge v0, v6, :cond_21

    .line 24
    .line 25
    aget-byte v6, v3, v0

    .line 26
    .line 27
    aget-byte v5, v5, v0

    .line 28
    .line 29
    if-eq v6, v5, :cond_20

    .line 30
    .line 31
    const-string v0, "FUJIFILMCCD-RAW"

    .line 32
    .line 33
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {v0, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const/4 v5, 0x0

    .line 42
    :goto_1
    array-length v6, v0

    .line 43
    if-ge v5, v6, :cond_1f

    .line 44
    .line 45
    aget-byte v6, v3, v5

    .line 46
    .line 47
    aget-byte v8, v0, v5

    .line 48
    .line 49
    if-eq v6, v8, :cond_1e

    .line 50
    .line 51
    const/4 v6, 0x1

    .line 52
    :try_start_0
    new-instance v8, Ld1/b;

    .line 53
    .line 54
    invoke-direct {v8, v3}, Ld1/b;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 55
    .line 56
    .line 57
    :try_start_1
    invoke-virtual {v8}, Ld1/b;->readInt()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    int-to-long v9, v0

    .line 62
    new-array v0, v7, [B

    .line 63
    .line 64
    invoke-virtual {v8, v0}, Ld1/b;->readFully([B)V

    .line 65
    .line 66
    .line 67
    sget-object v11, Ld1/g;->r:[B

    .line 68
    .line 69
    invoke-static {v0, v11}, Ljava/util/Arrays;->equals([B[B)Z

    .line 70
    .line 71
    .line 72
    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    if-nez v0, :cond_0

    .line 74
    .line 75
    :goto_2
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V

    .line 76
    .line 77
    .line 78
    const/16 p1, 0x0

    .line 79
    .line 80
    goto/16 :goto_a

    .line 81
    .line 82
    :cond_0
    const-wide/16 v11, 0x8

    .line 83
    .line 84
    const-wide/16 v13, 0x1

    .line 85
    .line 86
    cmp-long v0, v9, v13

    .line 87
    .line 88
    if-nez v0, :cond_2

    .line 89
    .line 90
    :try_start_2
    invoke-virtual {v8}, Ld1/b;->readLong()J

    .line 91
    .line 92
    .line 93
    move-result-wide v9
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 94
    const-wide/16 v15, 0x10

    .line 95
    .line 96
    cmp-long v0, v9, v15

    .line 97
    .line 98
    if-gez v0, :cond_1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_1
    :goto_3
    const/16 p1, 0x0

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    move-object v5, v8

    .line 106
    goto/16 :goto_1a

    .line 107
    .line 108
    :catch_0
    move-exception v0

    .line 109
    const/16 p1, 0x0

    .line 110
    .line 111
    goto :goto_9

    .line 112
    :cond_2
    move-wide v15, v11

    .line 113
    goto :goto_3

    .line 114
    :goto_4
    int-to-long v4, v2

    .line 115
    cmp-long v0, v9, v4

    .line 116
    .line 117
    if-lez v0, :cond_3

    .line 118
    .line 119
    move-wide v9, v4

    .line 120
    :cond_3
    sub-long/2addr v9, v15

    .line 121
    cmp-long v0, v9, v11

    .line 122
    .line 123
    if-gez v0, :cond_5

    .line 124
    .line 125
    :catch_1
    :cond_4
    :goto_5
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V

    .line 126
    .line 127
    .line 128
    goto :goto_a

    .line 129
    :cond_5
    :try_start_3
    new-array v0, v7, [B

    .line 130
    .line 131
    const-wide/16 v4, 0x0

    .line 132
    .line 133
    const/4 v2, 0x0

    .line 134
    const/4 v11, 0x0

    .line 135
    :goto_6
    const-wide/16 v15, 0x4

    .line 136
    .line 137
    div-long v15, v9, v15
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 138
    .line 139
    cmp-long v12, v4, v15

    .line 140
    .line 141
    if-gez v12, :cond_4

    .line 142
    .line 143
    :try_start_4
    invoke-virtual {v8, v0}, Ld1/b;->readFully([B)V
    :try_end_4
    .catch Ljava/io/EOFException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 144
    .line 145
    .line 146
    cmp-long v12, v4, v13

    .line 147
    .line 148
    if-nez v12, :cond_6

    .line 149
    .line 150
    goto :goto_8

    .line 151
    :cond_6
    :try_start_5
    sget-object v12, Ld1/g;->s:[B

    .line 152
    .line 153
    invoke-static {v0, v12}, Ljava/util/Arrays;->equals([B[B)Z

    .line 154
    .line 155
    .line 156
    move-result v12

    .line 157
    if-eqz v12, :cond_7

    .line 158
    .line 159
    const/4 v2, 0x1

    .line 160
    goto :goto_7

    .line 161
    :cond_7
    sget-object v12, Ld1/g;->t:[B

    .line 162
    .line 163
    invoke-static {v0, v12}, Ljava/util/Arrays;->equals([B[B)Z

    .line 164
    .line 165
    .line 166
    move-result v12
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 167
    if-eqz v12, :cond_8

    .line 168
    .line 169
    const/4 v11, 0x1

    .line 170
    :cond_8
    :goto_7
    if-eqz v2, :cond_9

    .line 171
    .line 172
    if-eqz v11, :cond_9

    .line 173
    .line 174
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V

    .line 175
    .line 176
    .line 177
    const/16 v0, 0xc

    .line 178
    .line 179
    return v0

    .line 180
    :cond_9
    :goto_8
    add-long/2addr v4, v13

    .line 181
    goto :goto_6

    .line 182
    :catch_2
    move-exception v0

    .line 183
    goto :goto_9

    .line 184
    :catchall_1
    move-exception v0

    .line 185
    const/4 v5, 0x0

    .line 186
    goto/16 :goto_1a

    .line 187
    .line 188
    :catch_3
    move-exception v0

    .line 189
    const/16 p1, 0x0

    .line 190
    .line 191
    const/4 v8, 0x0

    .line 192
    :goto_9
    :try_start_6
    sget-boolean v2, Ld1/g;->l:Z

    .line 193
    .line 194
    if-eqz v2, :cond_a

    .line 195
    .line 196
    const-string v2, "ExifInterface"

    .line 197
    .line 198
    const-string v4, "Exception parsing HEIF file type box."

    .line 199
    .line 200
    invoke-static {v2, v4, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 201
    .line 202
    .line 203
    :cond_a
    if-eqz v8, :cond_b

    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_b
    :goto_a
    :try_start_7
    new-instance v2, Ld1/b;

    .line 207
    .line 208
    invoke-direct {v2, v3}, Ld1/b;-><init>([B)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 209
    .line 210
    .line 211
    :try_start_8
    invoke-static {v2}, Ld1/g;->r(Ld1/b;)Ljava/nio/ByteOrder;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    iput-object v0, v1, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 216
    .line 217
    iput-object v0, v2, Ld1/b;->j:Ljava/nio/ByteOrder;

    .line 218
    .line 219
    invoke-virtual {v2}, Ld1/b;->readShort()S

    .line 220
    .line 221
    .line 222
    move-result v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 223
    const/16 v4, 0x4f52

    .line 224
    .line 225
    if-eq v0, v4, :cond_d

    .line 226
    .line 227
    const/16 v4, 0x5352

    .line 228
    .line 229
    if-ne v0, v4, :cond_c

    .line 230
    .line 231
    goto :goto_b

    .line 232
    :cond_c
    const/4 v0, 0x0

    .line 233
    goto :goto_c

    .line 234
    :cond_d
    :goto_b
    const/4 v0, 0x1

    .line 235
    :goto_c
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 236
    .line 237
    .line 238
    goto :goto_f

    .line 239
    :catchall_2
    move-exception v0

    .line 240
    move-object v5, v2

    .line 241
    goto :goto_d

    .line 242
    :catch_4
    nop

    .line 243
    goto :goto_e

    .line 244
    :catchall_3
    move-exception v0

    .line 245
    const/4 v5, 0x0

    .line 246
    goto :goto_d

    .line 247
    :catch_5
    nop

    .line 248
    const/4 v2, 0x0

    .line 249
    goto :goto_e

    .line 250
    :goto_d
    if-eqz v5, :cond_e

    .line 251
    .line 252
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V

    .line 253
    .line 254
    .line 255
    :cond_e
    throw v0

    .line 256
    :goto_e
    if-eqz v2, :cond_f

    .line 257
    .line 258
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 259
    .line 260
    .line 261
    :cond_f
    const/4 v0, 0x0

    .line 262
    :goto_f
    if-eqz v0, :cond_10

    .line 263
    .line 264
    const/4 v0, 0x7

    .line 265
    return v0

    .line 266
    :cond_10
    :try_start_9
    new-instance v2, Ld1/b;

    .line 267
    .line 268
    invoke-direct {v2, v3}, Ld1/b;-><init>([B)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_7
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 269
    .line 270
    .line 271
    :try_start_a
    invoke-static {v2}, Ld1/g;->r(Ld1/b;)Ljava/nio/ByteOrder;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    iput-object v0, v1, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 276
    .line 277
    iput-object v0, v2, Ld1/b;->j:Ljava/nio/ByteOrder;

    .line 278
    .line 279
    invoke-virtual {v2}, Ld1/b;->readShort()S

    .line 280
    .line 281
    .line 282
    move-result v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_6
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 283
    const/16 v4, 0x55

    .line 284
    .line 285
    if-ne v0, v4, :cond_11

    .line 286
    .line 287
    const/4 v0, 0x1

    .line 288
    goto :goto_10

    .line 289
    :cond_11
    const/4 v0, 0x0

    .line 290
    :goto_10
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 291
    .line 292
    .line 293
    goto :goto_13

    .line 294
    :catchall_4
    move-exception v0

    .line 295
    move-object v5, v2

    .line 296
    goto :goto_11

    .line 297
    :catch_6
    nop

    .line 298
    move-object v5, v2

    .line 299
    goto :goto_12

    .line 300
    :catchall_5
    move-exception v0

    .line 301
    const/4 v5, 0x0

    .line 302
    goto :goto_11

    .line 303
    :catch_7
    nop

    .line 304
    const/4 v5, 0x0

    .line 305
    goto :goto_12

    .line 306
    :goto_11
    if-eqz v5, :cond_12

    .line 307
    .line 308
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V

    .line 309
    .line 310
    .line 311
    :cond_12
    throw v0

    .line 312
    :goto_12
    if-eqz v5, :cond_13

    .line 313
    .line 314
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V

    .line 315
    .line 316
    .line 317
    :cond_13
    const/4 v0, 0x0

    .line 318
    :goto_13
    if-eqz v0, :cond_14

    .line 319
    .line 320
    const/16 v0, 0xa

    .line 321
    .line 322
    return v0

    .line 323
    :cond_14
    const/4 v0, 0x0

    .line 324
    :goto_14
    sget-object v2, Ld1/g;->w:[B

    .line 325
    .line 326
    array-length v4, v2

    .line 327
    if-ge v0, v4, :cond_16

    .line 328
    .line 329
    aget-byte v4, v3, v0

    .line 330
    .line 331
    aget-byte v2, v2, v0

    .line 332
    .line 333
    if-eq v4, v2, :cond_15

    .line 334
    .line 335
    const/4 v0, 0x0

    .line 336
    goto :goto_15

    .line 337
    :cond_15
    add-int/lit8 v0, v0, 0x1

    .line 338
    .line 339
    goto :goto_14

    .line 340
    :cond_16
    const/4 v0, 0x1

    .line 341
    :goto_15
    if-eqz v0, :cond_17

    .line 342
    .line 343
    const/16 v0, 0xd

    .line 344
    .line 345
    return v0

    .line 346
    :cond_17
    const/4 v0, 0x0

    .line 347
    :goto_16
    sget-object v2, Ld1/g;->A:[B

    .line 348
    .line 349
    array-length v4, v2

    .line 350
    if-ge v0, v4, :cond_19

    .line 351
    .line 352
    aget-byte v4, v3, v0

    .line 353
    .line 354
    aget-byte v2, v2, v0

    .line 355
    .line 356
    if-eq v4, v2, :cond_18

    .line 357
    .line 358
    :goto_17
    const/4 v6, 0x0

    .line 359
    goto :goto_19

    .line 360
    :cond_18
    add-int/lit8 v0, v0, 0x1

    .line 361
    .line 362
    goto :goto_16

    .line 363
    :cond_19
    const/4 v0, 0x0

    .line 364
    :goto_18
    sget-object v4, Ld1/g;->B:[B

    .line 365
    .line 366
    array-length v5, v4

    .line 367
    if-ge v0, v5, :cond_1b

    .line 368
    .line 369
    array-length v5, v2

    .line 370
    add-int/2addr v5, v0

    .line 371
    add-int/2addr v5, v7

    .line 372
    aget-byte v5, v3, v5

    .line 373
    .line 374
    aget-byte v4, v4, v0

    .line 375
    .line 376
    if-eq v5, v4, :cond_1a

    .line 377
    .line 378
    goto :goto_17

    .line 379
    :cond_1a
    add-int/lit8 v0, v0, 0x1

    .line 380
    .line 381
    goto :goto_18

    .line 382
    :cond_1b
    :goto_19
    if-eqz v6, :cond_1c

    .line 383
    .line 384
    const/16 v0, 0xe

    .line 385
    .line 386
    return v0

    .line 387
    :cond_1c
    return p1

    .line 388
    :goto_1a
    if-eqz v5, :cond_1d

    .line 389
    .line 390
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V

    .line 391
    .line 392
    .line 393
    :cond_1d
    throw v0

    .line 394
    :cond_1e
    const/16 p1, 0x0

    .line 395
    .line 396
    add-int/lit8 v5, v5, 0x1

    .line 397
    .line 398
    goto/16 :goto_1

    .line 399
    .line 400
    :cond_1f
    const/16 v0, 0x9

    .line 401
    .line 402
    return v0

    .line 403
    :cond_20
    const/16 p1, 0x0

    .line 404
    .line 405
    add-int/lit8 v0, v0, 0x1

    .line 406
    .line 407
    goto/16 :goto_0

    .line 408
    .line 409
    :cond_21
    return v7
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
.end method

.method public final h(Ld1/f;)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, Ld1/g;->k(Ld1/f;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Ld1/g;->d:[Ljava/util/HashMap;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    aget-object v1, p1, v0

    .line 8
    .line 9
    const-string v2, "MakerNote"

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ld1/c;

    .line 16
    .line 17
    if-eqz v1, :cond_6

    .line 18
    .line 19
    new-instance v2, Ld1/f;

    .line 20
    .line 21
    iget-object v1, v1, Ld1/c;->d:[B

    .line 22
    .line 23
    invoke-direct {v2, v1}, Ld1/f;-><init>([B)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    iput-object v1, v2, Ld1/b;->j:Ljava/nio/ByteOrder;

    .line 29
    .line 30
    sget-object v1, Ld1/g;->u:[B

    .line 31
    .line 32
    array-length v3, v1

    .line 33
    new-array v3, v3, [B

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ld1/b;->readFully([B)V

    .line 36
    .line 37
    .line 38
    const-wide/16 v4, 0x0

    .line 39
    .line 40
    invoke-virtual {v2, v4, v5}, Ld1/f;->b(J)V

    .line 41
    .line 42
    .line 43
    sget-object v4, Ld1/g;->v:[B

    .line 44
    .line 45
    array-length v5, v4

    .line 46
    new-array v5, v5, [B

    .line 47
    .line 48
    invoke-virtual {v2, v5}, Ld1/b;->readFully([B)V

    .line 49
    .line 50
    .line 51
    invoke-static {v3, v1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    const-wide/16 v3, 0x8

    .line 58
    .line 59
    invoke-virtual {v2, v3, v4}, Ld1/f;->b(J)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-static {v5, v4}, Ljava/util/Arrays;->equals([B[B)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    const-wide/16 v3, 0xc

    .line 70
    .line 71
    invoke-virtual {v2, v3, v4}, Ld1/f;->b(J)V

    .line 72
    .line 73
    .line 74
    :cond_1
    :goto_0
    const/4 v1, 0x6

    .line 75
    invoke-virtual {p0, v2, v1}, Ld1/g;->t(Ld1/f;I)V

    .line 76
    .line 77
    .line 78
    const/4 v1, 0x7

    .line 79
    aget-object v2, p1, v1

    .line 80
    .line 81
    const-string v3, "PreviewImageStart"

    .line 82
    .line 83
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, Ld1/c;

    .line 88
    .line 89
    aget-object v1, p1, v1

    .line 90
    .line 91
    const-string v3, "PreviewImageLength"

    .line 92
    .line 93
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, Ld1/c;

    .line 98
    .line 99
    if-eqz v2, :cond_2

    .line 100
    .line 101
    if-eqz v1, :cond_2

    .line 102
    .line 103
    const/4 v3, 0x5

    .line 104
    aget-object v4, p1, v3

    .line 105
    .line 106
    const-string v5, "JPEGInterchangeFormat"

    .line 107
    .line 108
    invoke-virtual {v4, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    aget-object v2, p1, v3

    .line 112
    .line 113
    const-string v3, "JPEGInterchangeFormatLength"

    .line 114
    .line 115
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    :cond_2
    const/16 v1, 0x8

    .line 119
    .line 120
    aget-object v1, p1, v1

    .line 121
    .line 122
    const-string v2, "AspectFrame"

    .line 123
    .line 124
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    check-cast v1, Ld1/c;

    .line 129
    .line 130
    if-eqz v1, :cond_6

    .line 131
    .line 132
    iget-object v2, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 133
    .line 134
    invoke-virtual {v1, v2}, Ld1/c;->g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, [I

    .line 139
    .line 140
    if-eqz v1, :cond_5

    .line 141
    .line 142
    array-length v2, v1

    .line 143
    const/4 v3, 0x4

    .line 144
    if-eq v2, v3, :cond_3

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_3
    const/4 v2, 0x2

    .line 148
    aget v2, v1, v2

    .line 149
    .line 150
    const/4 v3, 0x0

    .line 151
    aget v4, v1, v3

    .line 152
    .line 153
    if-le v2, v4, :cond_6

    .line 154
    .line 155
    const/4 v5, 0x3

    .line 156
    aget v5, v1, v5

    .line 157
    .line 158
    aget v1, v1, v0

    .line 159
    .line 160
    if-le v5, v1, :cond_6

    .line 161
    .line 162
    sub-int/2addr v2, v4

    .line 163
    add-int/2addr v2, v0

    .line 164
    sub-int/2addr v5, v1

    .line 165
    add-int/2addr v5, v0

    .line 166
    if-ge v2, v5, :cond_4

    .line 167
    .line 168
    add-int/2addr v2, v5

    .line 169
    sub-int v5, v2, v5

    .line 170
    .line 171
    sub-int/2addr v2, v5

    .line 172
    :cond_4
    iget-object v0, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 173
    .line 174
    invoke-static {v2, v0}, Ld1/c;->c(ILjava/nio/ByteOrder;)Ld1/c;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    iget-object v1, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 179
    .line 180
    invoke-static {v5, v1}, Ld1/c;->c(ILjava/nio/ByteOrder;)Ld1/c;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    aget-object v2, p1, v3

    .line 185
    .line 186
    const-string v4, "ImageWidth"

    .line 187
    .line 188
    invoke-virtual {v2, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    aget-object p1, p1, v3

    .line 192
    .line 193
    const-string v0, "ImageLength"

    .line 194
    .line 195
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :cond_5
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    const-string v0, "Invalid aspect frame values. frame="

    .line 202
    .line 203
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    const-string v0, "ExifInterface"

    .line 218
    .line 219
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 220
    .line 221
    .line 222
    :cond_6
    return-void
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
.end method

.method public final i(Ld1/b;)V
    .locals 6

    .line 1
    sget-boolean v0, Ld1/g;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "getPngAttributes starting with: "

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "ExifInterface"

    .line 20
    .line 21
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 25
    .line 26
    iput-object v0, p1, Ld1/b;->j:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    sget-object v0, Ld1/g;->w:[B

    .line 29
    .line 30
    array-length v1, v0

    .line 31
    invoke-virtual {p1, v1}, Ld1/b;->a(I)V

    .line 32
    .line 33
    .line 34
    array-length v0, v0

    .line 35
    :goto_0
    :try_start_0
    invoke-virtual {p1}, Ld1/b;->readInt()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/4 v2, 0x4

    .line 40
    new-array v2, v2, [B

    .line 41
    .line 42
    invoke-virtual {p1, v2}, Ld1/b;->readFully([B)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 v0, v0, 0x8

    .line 46
    .line 47
    const/16 v3, 0x10

    .line 48
    .line 49
    if-ne v0, v3, :cond_2

    .line 50
    .line 51
    sget-object v3, Ld1/g;->y:[B

    .line 52
    .line 53
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 61
    .line 62
    const-string v0, "Encountered invalid PNG file--IHDR chunk should appearas the first chunk"

    .line 63
    .line 64
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_2
    :goto_1
    sget-object v3, Ld1/g;->z:[B

    .line 69
    .line 70
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_3

    .line 75
    .line 76
    return-void

    .line 77
    :cond_3
    sget-object v3, Ld1/g;->x:[B

    .line 78
    .line 79
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_5

    .line 84
    .line 85
    new-array v1, v1, [B

    .line 86
    .line 87
    invoke-virtual {p1, v1}, Ld1/b;->readFully([B)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Ld1/b;->readInt()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    new-instance v3, Ljava/util/zip/CRC32;

    .line 95
    .line 96
    invoke-direct {v3}, Ljava/util/zip/CRC32;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3, v2}, Ljava/util/zip/CRC32;->update([B)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, v1}, Ljava/util/zip/CRC32;->update([B)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3}, Ljava/util/zip/CRC32;->getValue()J

    .line 106
    .line 107
    .line 108
    move-result-wide v4

    .line 109
    long-to-int v2, v4

    .line 110
    if-ne v2, p1, :cond_4

    .line 111
    .line 112
    iput v0, p0, Ld1/g;->h:I

    .line 113
    .line 114
    const/4 p1, 0x0

    .line 115
    invoke-virtual {p0, p1, v1}, Ld1/g;->s(I[B)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Ld1/g;->y()V

    .line 119
    .line 120
    .line 121
    new-instance p1, Ld1/b;

    .line 122
    .line 123
    invoke-direct {p1, v1}, Ld1/b;-><init>([B)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, p1}, Ld1/g;->v(Ld1/b;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_4
    new-instance v0, Ljava/io/IOException;

    .line 131
    .line 132
    new-instance v1, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    .line 136
    .line 137
    const-string v2, "Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: "

    .line 138
    .line 139
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string p1, ", calculated CRC value: "

    .line 146
    .line 147
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3}, Ljava/util/zip/CRC32;->getValue()J

    .line 151
    .line 152
    .line 153
    move-result-wide v2

    .line 154
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v0

    .line 165
    :cond_5
    add-int/lit8 v1, v1, 0x4

    .line 166
    .line 167
    invoke-virtual {p1, v1}, Ld1/b;->a(I)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    .line 169
    .line 170
    add-int/2addr v0, v1

    .line 171
    goto/16 :goto_0

    .line 172
    .line 173
    :catch_0
    new-instance p1, Ljava/io/IOException;

    .line 174
    .line 175
    const-string v0, "Encountered corrupt PNG file."

    .line 176
    .line 177
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw p1
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
.end method

.method public final j(Ld1/b;)V
    .locals 9

    .line 1
    const-string v0, "ExifInterface"

    .line 2
    .line 3
    sget-boolean v1, Ld1/g;->l:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v3, "getRafAttributes starting with: "

    .line 10
    .line 11
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    const/16 v2, 0x54

    .line 25
    .line 26
    invoke-virtual {p1, v2}, Ld1/b;->a(I)V

    .line 27
    .line 28
    .line 29
    const/4 v2, 0x4

    .line 30
    new-array v3, v2, [B

    .line 31
    .line 32
    new-array v4, v2, [B

    .line 33
    .line 34
    new-array v2, v2, [B

    .line 35
    .line 36
    invoke-virtual {p1, v3}, Ld1/b;->readFully([B)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v4}, Ld1/b;->readFully([B)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v2}, Ld1/b;->readFully([B)V

    .line 43
    .line 44
    .line 45
    invoke-static {v3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-static {v4}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->getInt()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    new-array v4, v4, [B

    .line 70
    .line 71
    iget v5, p1, Ld1/b;->i:I

    .line 72
    .line 73
    sub-int v5, v3, v5

    .line 74
    .line 75
    invoke-virtual {p1, v5}, Ld1/b;->a(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v4}, Ld1/b;->readFully([B)V

    .line 79
    .line 80
    .line 81
    new-instance v5, Ld1/b;

    .line 82
    .line 83
    invoke-direct {v5, v4}, Ld1/b;-><init>([B)V

    .line 84
    .line 85
    .line 86
    const/4 v4, 0x5

    .line 87
    invoke-virtual {p0, v5, v3, v4}, Ld1/g;->f(Ld1/b;II)V

    .line 88
    .line 89
    .line 90
    iget v3, p1, Ld1/b;->i:I

    .line 91
    .line 92
    sub-int/2addr v2, v3

    .line 93
    invoke-virtual {p1, v2}, Ld1/b;->a(I)V

    .line 94
    .line 95
    .line 96
    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 97
    .line 98
    iput-object v2, p1, Ld1/b;->j:Ljava/nio/ByteOrder;

    .line 99
    .line 100
    invoke-virtual {p1}, Ld1/b;->readInt()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v1, :cond_1

    .line 105
    .line 106
    new-instance v3, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string v4, "numberOfDirectoryEntry: "

    .line 109
    .line 110
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    :cond_1
    const/4 v3, 0x0

    .line 124
    const/4 v4, 0x0

    .line 125
    :goto_0
    if-ge v4, v2, :cond_3

    .line 126
    .line 127
    invoke-virtual {p1}, Ld1/b;->readUnsignedShort()I

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    invoke-virtual {p1}, Ld1/b;->readUnsignedShort()I

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    sget-object v7, Ld1/g;->G:Ld1/d;

    .line 136
    .line 137
    iget v7, v7, Ld1/d;->a:I

    .line 138
    .line 139
    if-ne v5, v7, :cond_2

    .line 140
    .line 141
    invoke-virtual {p1}, Ld1/b;->readShort()S

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    invoke-virtual {p1}, Ld1/b;->readShort()S

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    iget-object v4, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 150
    .line 151
    invoke-static {v2, v4}, Ld1/c;->c(ILjava/nio/ByteOrder;)Ld1/c;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    iget-object v5, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 156
    .line 157
    invoke-static {p1, v5}, Ld1/c;->c(ILjava/nio/ByteOrder;)Ld1/c;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    iget-object v6, p0, Ld1/g;->d:[Ljava/util/HashMap;

    .line 162
    .line 163
    aget-object v7, v6, v3

    .line 164
    .line 165
    const-string v8, "ImageLength"

    .line 166
    .line 167
    invoke-virtual {v7, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    aget-object v3, v6, v3

    .line 171
    .line 172
    const-string v4, "ImageWidth"

    .line 173
    .line 174
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    if-eqz v1, :cond_3

    .line 178
    .line 179
    new-instance v1, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    const-string v3, "Updated to length: "

    .line 182
    .line 183
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const-string v2, ", width: "

    .line 190
    .line 191
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :cond_2
    invoke-virtual {p1, v6}, Ld1/b;->a(I)V

    .line 206
    .line 207
    .line 208
    add-int/lit8 v4, v4, 0x1

    .line 209
    .line 210
    goto :goto_0

    .line 211
    :cond_3
    return-void
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
.end method

.method public final k(Ld1/f;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Ld1/g;->p(Ld1/f;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p1, v0}, Ld1/g;->t(Ld1/f;I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, Ld1/g;->x(Ld1/f;I)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x5

    .line 12
    invoke-virtual {p0, p1, v0}, Ld1/g;->x(Ld1/f;I)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    invoke-virtual {p0, p1, v0}, Ld1/g;->x(Ld1/f;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ld1/g;->y()V

    .line 20
    .line 21
    .line 22
    iget p1, p0, Ld1/g;->c:I

    .line 23
    .line 24
    const/16 v0, 0x8

    .line 25
    .line 26
    if-ne p1, v0, :cond_0

    .line 27
    .line 28
    iget-object p1, p0, Ld1/g;->d:[Ljava/util/HashMap;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    aget-object v1, p1, v0

    .line 32
    .line 33
    const-string v2, "MakerNote"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Ld1/c;

    .line 40
    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    new-instance v2, Ld1/f;

    .line 44
    .line 45
    iget-object v1, v1, Ld1/c;->d:[B

    .line 46
    .line 47
    invoke-direct {v2, v1}, Ld1/f;-><init>([B)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 51
    .line 52
    iput-object v1, v2, Ld1/b;->j:Ljava/nio/ByteOrder;

    .line 53
    .line 54
    const/4 v1, 0x6

    .line 55
    invoke-virtual {v2, v1}, Ld1/b;->a(I)V

    .line 56
    .line 57
    .line 58
    const/16 v1, 0x9

    .line 59
    .line 60
    invoke-virtual {p0, v2, v1}, Ld1/g;->t(Ld1/f;I)V

    .line 61
    .line 62
    .line 63
    aget-object v1, p1, v1

    .line 64
    .line 65
    const-string v2, "ColorSpace"

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Ld1/c;

    .line 72
    .line 73
    if-eqz v1, :cond_0

    .line 74
    .line 75
    aget-object p1, p1, v0

    .line 76
    .line 77
    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    :cond_0
    return-void
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

.method public final l(Ld1/f;)V
    .locals 5

    .line 1
    sget-boolean v0, Ld1/g;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "getRw2Attributes starting with: "

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "ExifInterface"

    .line 20
    .line 21
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0, p1}, Ld1/g;->k(Ld1/f;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Ld1/g;->d:[Ljava/util/HashMap;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    aget-object v1, p1, v0

    .line 31
    .line 32
    const-string v2, "JpgFromRaw"

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ld1/c;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    new-instance v2, Ld1/b;

    .line 43
    .line 44
    iget-object v3, v1, Ld1/c;->d:[B

    .line 45
    .line 46
    invoke-direct {v2, v3}, Ld1/b;-><init>([B)V

    .line 47
    .line 48
    .line 49
    iget-wide v3, v1, Ld1/c;->c:J

    .line 50
    .line 51
    long-to-int v1, v3

    .line 52
    const/4 v3, 0x5

    .line 53
    invoke-virtual {p0, v2, v1, v3}, Ld1/g;->f(Ld1/b;II)V

    .line 54
    .line 55
    .line 56
    :cond_1
    aget-object v0, p1, v0

    .line 57
    .line 58
    const-string v1, "ISO"

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Ld1/c;

    .line 65
    .line 66
    const/4 v1, 0x1

    .line 67
    aget-object v2, p1, v1

    .line 68
    .line 69
    const-string v3, "PhotographicSensitivity"

    .line 70
    .line 71
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Ld1/c;

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    if-nez v2, :cond_2

    .line 80
    .line 81
    aget-object p1, p1, v1

    .line 82
    .line 83
    invoke-virtual {p1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    :cond_2
    return-void
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

.method public final m(Ld1/b;)V
    .locals 5

    .line 1
    sget-boolean v0, Ld1/g;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "getWebpAttributes starting with: "

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "ExifInterface"

    .line 20
    .line 21
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 25
    .line 26
    iput-object v0, p1, Ld1/b;->j:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    sget-object v0, Ld1/g;->A:[B

    .line 29
    .line 30
    array-length v0, v0

    .line 31
    invoke-virtual {p1, v0}, Ld1/b;->a(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ld1/b;->readInt()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    add-int/lit8 v0, v0, 0x8

    .line 39
    .line 40
    sget-object v1, Ld1/g;->B:[B

    .line 41
    .line 42
    array-length v2, v1

    .line 43
    invoke-virtual {p1, v2}, Ld1/b;->a(I)V

    .line 44
    .line 45
    .line 46
    array-length v1, v1

    .line 47
    add-int/lit8 v1, v1, 0x8

    .line 48
    .line 49
    :goto_0
    const/4 v2, 0x4

    .line 50
    :try_start_0
    new-array v2, v2, [B

    .line 51
    .line 52
    invoke-virtual {p1, v2}, Ld1/b;->readFully([B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Ld1/b;->readInt()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    add-int/lit8 v1, v1, 0x8

    .line 60
    .line 61
    sget-object v4, Ld1/g;->C:[B

    .line 62
    .line 63
    invoke-static {v4, v2}, Ljava/util/Arrays;->equals([B[B)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    new-array v0, v3, [B

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Ld1/b;->readFully([B)V

    .line 72
    .line 73
    .line 74
    iput v1, p0, Ld1/g;->h:I

    .line 75
    .line 76
    const/4 p1, 0x0

    .line 77
    invoke-virtual {p0, p1, v0}, Ld1/g;->s(I[B)V

    .line 78
    .line 79
    .line 80
    new-instance p1, Ld1/b;

    .line 81
    .line 82
    invoke-direct {p1, v0}, Ld1/b;-><init>([B)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, p1}, Ld1/g;->v(Ld1/b;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_1
    rem-int/lit8 v2, v3, 0x2

    .line 90
    .line 91
    const/4 v4, 0x1

    .line 92
    if-ne v2, v4, :cond_2

    .line 93
    .line 94
    add-int/lit8 v3, v3, 0x1

    .line 95
    .line 96
    :cond_2
    add-int/2addr v1, v3

    .line 97
    if-ne v1, v0, :cond_3

    .line 98
    .line 99
    return-void

    .line 100
    :cond_3
    if-gt v1, v0, :cond_4

    .line 101
    .line 102
    invoke-virtual {p1, v3}, Ld1/b;->a(I)V

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    new-instance p1, Ljava/io/IOException;

    .line 107
    .line 108
    const-string v0, "Encountered WebP file with invalid chunk size"

    .line 109
    .line 110
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    :catch_0
    new-instance p1, Ljava/io/IOException;

    .line 115
    .line 116
    const-string v0, "Encountered corrupt WebP file."

    .line 117
    .line 118
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p1
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

.method public final n(Ld1/b;Ljava/util/HashMap;)V
    .locals 3

    .line 1
    const-string v0, "JPEGInterchangeFormat"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ld1/c;

    .line 8
    .line 9
    const-string v1, "JPEGInterchangeFormatLength"

    .line 10
    .line 11
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Ld1/c;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    if-eqz p2, :cond_2

    .line 20
    .line 21
    iget-object v1, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ld1/c;->e(Ljava/nio/ByteOrder;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v1, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 28
    .line 29
    invoke-virtual {p2, v1}, Ld1/c;->e(Ljava/nio/ByteOrder;)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    iget v1, p0, Ld1/g;->c:I

    .line 34
    .line 35
    const/4 v2, 0x7

    .line 36
    if-ne v1, v2, :cond_0

    .line 37
    .line 38
    iget v1, p0, Ld1/g;->i:I

    .line 39
    .line 40
    add-int/2addr v0, v1

    .line 41
    :cond_0
    if-lez v0, :cond_1

    .line 42
    .line 43
    if-lez p2, :cond_1

    .line 44
    .line 45
    iget-object v1, p0, Ld1/g;->b:Landroid/content/res/AssetManager$AssetInputStream;

    .line 46
    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    iget-object v1, p0, Ld1/g;->a:Ljava/io/FileDescriptor;

    .line 50
    .line 51
    if-nez v1, :cond_1

    .line 52
    .line 53
    new-array v1, p2, [B

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Ld1/b;->a(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v1}, Ld1/b;->readFully([B)V

    .line 59
    .line 60
    .line 61
    :cond_1
    sget-boolean p1, Ld1/g;->l:Z

    .line 62
    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    new-instance p1, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v1, "Setting thumbnail attributes with offset: "

    .line 68
    .line 69
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v0, ", length: "

    .line 76
    .line 77
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    const-string p2, "ExifInterface"

    .line 88
    .line 89
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    :cond_2
    return-void
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
.end method

.method public final o(Ljava/util/HashMap;)Z
    .locals 2

    .line 1
    const-string v0, "ImageLength"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ld1/c;

    .line 8
    .line 9
    const-string v1, "ImageWidth"

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ld1/c;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ld1/c;->e(Ljava/nio/ByteOrder;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v1, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Ld1/c;->e(Ljava/nio/ByteOrder;)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/16 v1, 0x200

    .line 34
    .line 35
    if-gt v0, v1, :cond_0

    .line 36
    .line 37
    if-gt p1, v1, :cond_0

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_0
    const/4 p1, 0x0

    .line 42
    return p1
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
.end method

.method public final p(Ld1/f;)V
    .locals 3

    .line 1
    invoke-static {p1}, Ld1/g;->r(Ld1/b;)Ljava/nio/ByteOrder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 6
    .line 7
    iput-object v0, p1, Ld1/b;->j:Ljava/nio/ByteOrder;

    .line 8
    .line 9
    invoke-virtual {p1}, Ld1/b;->readUnsignedShort()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, Ld1/g;->c:I

    .line 14
    .line 15
    const/4 v2, 0x7

    .line 16
    if-eq v1, v2, :cond_1

    .line 17
    .line 18
    const/16 v2, 0xa

    .line 19
    .line 20
    if-eq v1, v2, :cond_1

    .line 21
    .line 22
    const/16 v1, 0x2a

    .line 23
    .line 24
    if-ne v0, v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance p1, Ljava/io/IOException;

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v2, "Invalid start code: "

    .line 32
    .line 33
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ld1/b;->readInt()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const/16 v1, 0x8

    .line 56
    .line 57
    if-lt v0, v1, :cond_3

    .line 58
    .line 59
    add-int/lit8 v0, v0, -0x8

    .line 60
    .line 61
    if-lez v0, :cond_2

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Ld1/b;->a(I)V

    .line 64
    .line 65
    .line 66
    :cond_2
    return-void

    .line 67
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 68
    .line 69
    const-string v1, "Invalid first Ifd offset: "

    .line 70
    .line 71
    invoke-static {v0, v1}, Landroidx/appcompat/app/b;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p1
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

.method public final q()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Ld1/g;->d:[Ljava/util/HashMap;

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    if-ge v0, v2, :cond_1

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v3, "The size of tag group["

    .line 10
    .line 11
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v3, "]: "

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    aget-object v3, v1, v0

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/util/HashMap;->size()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-string v3, "ExifInterface"

    .line 36
    .line 37
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    aget-object v1, v1, v0

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_0

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Ljava/util/Map$Entry;

    .line 61
    .line 62
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, Ld1/c;

    .line 67
    .line 68
    new-instance v5, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v6, "tagName: "

    .line 71
    .line 72
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v2, ", tagType: "

    .line 85
    .line 86
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Ld1/c;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v2, ", tagValue: \'"

    .line 97
    .line 98
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    iget-object v2, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 102
    .line 103
    invoke-virtual {v4, v2}, Ld1/c;->f(Ljava/nio/ByteOrder;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v2, "\'"

    .line 111
    .line 112
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_1
    return-void
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

.method public final s(I[B)V
    .locals 1

    .line 1
    new-instance v0, Ld1/f;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Ld1/f;-><init>([B)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ld1/g;->p(Ld1/f;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0, p1}, Ld1/g;->t(Ld1/f;I)V

    .line 10
    .line 11
    .line 12
    return-void
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
.end method

.method public final t(Ld1/f;I)V
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iget v3, v1, Ld1/b;->i:I

    .line 8
    .line 9
    iget v4, v1, Ld1/b;->l:I

    .line 10
    .line 11
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget-object v5, v0, Ld1/g;->e:Ljava/util/HashSet;

    .line 16
    .line 17
    invoke-virtual {v5, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ld1/b;->readShort()S

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const-string v6, "ExifInterface"

    .line 25
    .line 26
    sget-boolean v7, Ld1/g;->l:Z

    .line 27
    .line 28
    if-eqz v7, :cond_0

    .line 29
    .line 30
    new-instance v8, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v9, "numberOfDirectoryEntry: "

    .line 33
    .line 34
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    invoke-static {v6, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    :cond_0
    if-gtz v3, :cond_1

    .line 48
    .line 49
    goto/16 :goto_16

    .line 50
    .line 51
    :cond_1
    const/4 v9, 0x0

    .line 52
    :goto_0
    iget-object v14, v0, Ld1/g;->d:[Ljava/util/HashMap;

    .line 53
    .line 54
    if-ge v9, v3, :cond_2d

    .line 55
    .line 56
    const/16 v16, 0x0

    .line 57
    .line 58
    invoke-virtual {v1}, Ld1/b;->readUnsignedShort()I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const-wide/16 v17, 0x0

    .line 63
    .line 64
    invoke-virtual {v1}, Ld1/b;->readUnsignedShort()I

    .line 65
    .line 66
    .line 67
    move-result v12

    .line 68
    invoke-virtual {v1}, Ld1/b;->readInt()I

    .line 69
    .line 70
    .line 71
    move-result v13

    .line 72
    const/16 v19, 0x1

    .line 73
    .line 74
    iget v11, v1, Ld1/b;->i:I

    .line 75
    .line 76
    int-to-long v10, v11

    .line 77
    const-wide/16 v21, 0x4

    .line 78
    .line 79
    add-long v10, v10, v21

    .line 80
    .line 81
    sget-object v23, Ld1/g;->J:[Ljava/util/HashMap;

    .line 82
    .line 83
    const/16 v24, 0x4

    .line 84
    .line 85
    aget-object v15, v23, v2

    .line 86
    .line 87
    move/from16 v25, v3

    .line 88
    .line 89
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {v15, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    check-cast v3, Ld1/d;

    .line 98
    .line 99
    const/16 v23, 0x2

    .line 100
    .line 101
    if-eqz v7, :cond_3

    .line 102
    .line 103
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v26

    .line 107
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v27

    .line 111
    const/16 v28, 0x3

    .line 112
    .line 113
    if-eqz v3, :cond_2

    .line 114
    .line 115
    iget-object v15, v3, Ld1/d;->b:Ljava/lang/String;

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_2
    const/4 v15, 0x0

    .line 119
    :goto_1
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v29

    .line 123
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v30

    .line 127
    move/from16 v31, v7

    .line 128
    .line 129
    const/4 v7, 0x5

    .line 130
    new-array v7, v7, [Ljava/lang/Object;

    .line 131
    .line 132
    aput-object v26, v7, v16

    .line 133
    .line 134
    aput-object v27, v7, v19

    .line 135
    .line 136
    aput-object v15, v7, v23

    .line 137
    .line 138
    aput-object v29, v7, v28

    .line 139
    .line 140
    aput-object v30, v7, v24

    .line 141
    .line 142
    const-string v15, "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"

    .line 143
    .line 144
    invoke-static {v15, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_3
    move/from16 v31, v7

    .line 153
    .line 154
    const/16 v28, 0x3

    .line 155
    .line 156
    :goto_2
    if-nez v3, :cond_5

    .line 157
    .line 158
    if-eqz v31, :cond_4

    .line 159
    .line 160
    new-instance v7, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    const-string v15, "Skip the tag entry since tag number is not defined: "

    .line 163
    .line 164
    invoke-direct {v7, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 175
    .line 176
    .line 177
    :cond_4
    move/from16 v30, v8

    .line 178
    .line 179
    goto/16 :goto_c

    .line 180
    .line 181
    :cond_5
    if-lez v12, :cond_6

    .line 182
    .line 183
    sget-object v7, Ld1/g;->E:[I

    .line 184
    .line 185
    array-length v15, v7

    .line 186
    if-lt v12, v15, :cond_7

    .line 187
    .line 188
    :cond_6
    move/from16 v30, v8

    .line 189
    .line 190
    goto/16 :goto_b

    .line 191
    .line 192
    :cond_7
    iget v15, v3, Ld1/d;->c:I

    .line 193
    .line 194
    move-object/from16 v29, v7

    .line 195
    .line 196
    const/4 v7, 0x7

    .line 197
    if-eq v15, v7, :cond_9

    .line 198
    .line 199
    if-ne v12, v7, :cond_8

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_8
    if-eq v15, v12, :cond_9

    .line 203
    .line 204
    iget v7, v3, Ld1/d;->d:I

    .line 205
    .line 206
    if-ne v7, v12, :cond_a

    .line 207
    .line 208
    :cond_9
    :goto_3
    move/from16 v30, v8

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_a
    move/from16 v30, v8

    .line 212
    .line 213
    const/4 v8, 0x4

    .line 214
    if-eq v15, v8, :cond_b

    .line 215
    .line 216
    if-ne v7, v8, :cond_c

    .line 217
    .line 218
    :cond_b
    const/4 v8, 0x3

    .line 219
    goto :goto_4

    .line 220
    :cond_c
    const/16 v8, 0x9

    .line 221
    .line 222
    goto :goto_6

    .line 223
    :goto_4
    if-ne v12, v8, :cond_c

    .line 224
    .line 225
    :goto_5
    const/4 v7, 0x7

    .line 226
    goto :goto_7

    .line 227
    :goto_6
    if-eq v15, v8, :cond_d

    .line 228
    .line 229
    if-ne v7, v8, :cond_e

    .line 230
    .line 231
    :cond_d
    const/16 v8, 0x8

    .line 232
    .line 233
    if-ne v12, v8, :cond_e

    .line 234
    .line 235
    goto :goto_5

    .line 236
    :cond_e
    const/16 v8, 0xc

    .line 237
    .line 238
    if-eq v15, v8, :cond_f

    .line 239
    .line 240
    if-ne v7, v8, :cond_10

    .line 241
    .line 242
    :cond_f
    const/16 v7, 0xb

    .line 243
    .line 244
    if-ne v12, v7, :cond_10

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_10
    if-eqz v31, :cond_15

    .line 248
    .line 249
    new-instance v7, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    const-string v8, "Skip the tag entry since data format ("

    .line 252
    .line 253
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    sget-object v8, Ld1/g;->D:[Ljava/lang/String;

    .line 257
    .line 258
    aget-object v8, v8, v12

    .line 259
    .line 260
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    const-string v8, ") is unexpected for tag: "

    .line 264
    .line 265
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    iget-object v8, v3, Ld1/d;->b:Ljava/lang/String;

    .line 269
    .line 270
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 278
    .line 279
    .line 280
    goto :goto_c

    .line 281
    :goto_7
    if-ne v12, v7, :cond_11

    .line 282
    .line 283
    move v12, v15

    .line 284
    :cond_11
    int-to-long v7, v13

    .line 285
    aget v15, v29, v12

    .line 286
    .line 287
    move-wide/from16 v32, v7

    .line 288
    .line 289
    int-to-long v7, v15

    .line 290
    mul-long v7, v7, v32

    .line 291
    .line 292
    cmp-long v15, v7, v17

    .line 293
    .line 294
    if-ltz v15, :cond_13

    .line 295
    .line 296
    const-wide/32 v32, 0x7fffffff

    .line 297
    .line 298
    .line 299
    cmp-long v15, v7, v32

    .line 300
    .line 301
    if-lez v15, :cond_12

    .line 302
    .line 303
    goto :goto_8

    .line 304
    :cond_12
    const/4 v15, 0x1

    .line 305
    goto :goto_d

    .line 306
    :cond_13
    :goto_8
    if-eqz v31, :cond_14

    .line 307
    .line 308
    new-instance v15, Ljava/lang/StringBuilder;

    .line 309
    .line 310
    move-wide/from16 v32, v7

    .line 311
    .line 312
    const-string v7, "Skip the tag entry since the number of components is invalid: "

    .line 313
    .line 314
    invoke-direct {v15, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v7

    .line 324
    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 325
    .line 326
    .line 327
    goto :goto_9

    .line 328
    :cond_14
    move-wide/from16 v32, v7

    .line 329
    .line 330
    :goto_9
    move-wide/from16 v7, v32

    .line 331
    .line 332
    :goto_a
    const/4 v15, 0x0

    .line 333
    goto :goto_d

    .line 334
    :goto_b
    if-eqz v31, :cond_15

    .line 335
    .line 336
    new-instance v7, Ljava/lang/StringBuilder;

    .line 337
    .line 338
    const-string v8, "Skip the tag entry since data format is invalid: "

    .line 339
    .line 340
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v7

    .line 350
    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 351
    .line 352
    .line 353
    :cond_15
    :goto_c
    move-wide/from16 v7, v17

    .line 354
    .line 355
    goto :goto_a

    .line 356
    :goto_d
    if-nez v15, :cond_16

    .line 357
    .line 358
    invoke-virtual {v1, v10, v11}, Ld1/f;->b(J)V

    .line 359
    .line 360
    .line 361
    move/from16 v29, v9

    .line 362
    .line 363
    goto/16 :goto_15

    .line 364
    .line 365
    :cond_16
    const-string v15, "Compression"

    .line 366
    .line 367
    cmp-long v29, v7, v21

    .line 368
    .line 369
    if-lez v29, :cond_1a

    .line 370
    .line 371
    move/from16 v29, v9

    .line 372
    .line 373
    invoke-virtual {v1}, Ld1/b;->readInt()I

    .line 374
    .line 375
    .line 376
    move-result v9

    .line 377
    if-eqz v31, :cond_17

    .line 378
    .line 379
    move-object/from16 v32, v14

    .line 380
    .line 381
    new-instance v14, Ljava/lang/StringBuilder;

    .line 382
    .line 383
    move-wide/from16 v33, v10

    .line 384
    .line 385
    const-string v10, "seek to data offset: "

    .line 386
    .line 387
    invoke-direct {v14, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v10

    .line 397
    invoke-static {v6, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 398
    .line 399
    .line 400
    goto :goto_e

    .line 401
    :cond_17
    move-wide/from16 v33, v10

    .line 402
    .line 403
    move-object/from16 v32, v14

    .line 404
    .line 405
    :goto_e
    iget v10, v0, Ld1/g;->c:I

    .line 406
    .line 407
    const/4 v11, 0x7

    .line 408
    if-ne v10, v11, :cond_18

    .line 409
    .line 410
    const-string v10, "MakerNote"

    .line 411
    .line 412
    iget-object v11, v3, Ld1/d;->b:Ljava/lang/String;

    .line 413
    .line 414
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-result v10

    .line 418
    if-eqz v10, :cond_19

    .line 419
    .line 420
    iput v9, v0, Ld1/g;->i:I

    .line 421
    .line 422
    :cond_18
    move/from16 v21, v13

    .line 423
    .line 424
    goto :goto_f

    .line 425
    :cond_19
    const/4 v10, 0x6

    .line 426
    if-ne v2, v10, :cond_18

    .line 427
    .line 428
    const-string v11, "ThumbnailImage"

    .line 429
    .line 430
    iget-object v14, v3, Ld1/d;->b:Ljava/lang/String;

    .line 431
    .line 432
    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result v11

    .line 436
    if-eqz v11, :cond_18

    .line 437
    .line 438
    iput v9, v0, Ld1/g;->j:I

    .line 439
    .line 440
    iput v13, v0, Ld1/g;->k:I

    .line 441
    .line 442
    iget-object v11, v0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 443
    .line 444
    invoke-static {v10, v11}, Ld1/c;->c(ILjava/nio/ByteOrder;)Ld1/c;

    .line 445
    .line 446
    .line 447
    move-result-object v10

    .line 448
    iget v11, v0, Ld1/g;->j:I

    .line 449
    .line 450
    move/from16 v21, v13

    .line 451
    .line 452
    int-to-long v13, v11

    .line 453
    iget-object v11, v0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 454
    .line 455
    invoke-static {v13, v14, v11}, Ld1/c;->a(JLjava/nio/ByteOrder;)Ld1/c;

    .line 456
    .line 457
    .line 458
    move-result-object v11

    .line 459
    iget v13, v0, Ld1/g;->k:I

    .line 460
    .line 461
    int-to-long v13, v13

    .line 462
    iget-object v2, v0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 463
    .line 464
    invoke-static {v13, v14, v2}, Ld1/c;->a(JLjava/nio/ByteOrder;)Ld1/c;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    const/16 v24, 0x4

    .line 469
    .line 470
    aget-object v13, v32, v24

    .line 471
    .line 472
    invoke-virtual {v13, v15, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    aget-object v10, v32, v24

    .line 476
    .line 477
    const-string v13, "JPEGInterchangeFormat"

    .line 478
    .line 479
    invoke-virtual {v10, v13, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    aget-object v10, v32, v24

    .line 483
    .line 484
    const-string v11, "JPEGInterchangeFormatLength"

    .line 485
    .line 486
    invoke-virtual {v10, v11, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    :goto_f
    int-to-long v9, v9

    .line 490
    invoke-virtual {v1, v9, v10}, Ld1/f;->b(J)V

    .line 491
    .line 492
    .line 493
    goto :goto_10

    .line 494
    :cond_1a
    move/from16 v29, v9

    .line 495
    .line 496
    move-wide/from16 v33, v10

    .line 497
    .line 498
    move/from16 v21, v13

    .line 499
    .line 500
    move-object/from16 v32, v14

    .line 501
    .line 502
    :goto_10
    sget-object v2, Ld1/g;->M:Ljava/util/HashMap;

    .line 503
    .line 504
    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 505
    .line 506
    .line 507
    move-result-object v9

    .line 508
    invoke-virtual {v2, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    check-cast v2, Ljava/lang/Integer;

    .line 513
    .line 514
    if-eqz v31, :cond_1b

    .line 515
    .line 516
    new-instance v9, Ljava/lang/StringBuilder;

    .line 517
    .line 518
    const-string v10, "nextIfdType: "

    .line 519
    .line 520
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    const-string v10, " byteCount: "

    .line 527
    .line 528
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v9

    .line 538
    invoke-static {v6, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 539
    .line 540
    .line 541
    :cond_1b
    if-eqz v2, :cond_26

    .line 542
    .line 543
    const/4 v9, 0x3

    .line 544
    if-eq v12, v9, :cond_1f

    .line 545
    .line 546
    const/4 v8, 0x4

    .line 547
    if-eq v12, v8, :cond_1e

    .line 548
    .line 549
    const/16 v8, 0x8

    .line 550
    .line 551
    if-eq v12, v8, :cond_1d

    .line 552
    .line 553
    const/16 v8, 0x9

    .line 554
    .line 555
    if-eq v12, v8, :cond_1c

    .line 556
    .line 557
    const/16 v7, 0xd

    .line 558
    .line 559
    if-eq v12, v7, :cond_1c

    .line 560
    .line 561
    const-wide/16 v7, -0x1

    .line 562
    .line 563
    goto :goto_12

    .line 564
    :cond_1c
    invoke-virtual {v1}, Ld1/b;->readInt()I

    .line 565
    .line 566
    .line 567
    move-result v7

    .line 568
    :goto_11
    int-to-long v7, v7

    .line 569
    goto :goto_12

    .line 570
    :cond_1d
    invoke-virtual {v1}, Ld1/b;->readShort()S

    .line 571
    .line 572
    .line 573
    move-result v7

    .line 574
    goto :goto_11

    .line 575
    :cond_1e
    invoke-virtual {v1}, Ld1/b;->readInt()I

    .line 576
    .line 577
    .line 578
    move-result v7

    .line 579
    int-to-long v7, v7

    .line 580
    const-wide v9, 0xffffffffL

    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    and-long/2addr v7, v9

    .line 586
    goto :goto_12

    .line 587
    :cond_1f
    invoke-virtual {v1}, Ld1/b;->readUnsignedShort()I

    .line 588
    .line 589
    .line 590
    move-result v7

    .line 591
    goto :goto_11

    .line 592
    :goto_12
    if-eqz v31, :cond_20

    .line 593
    .line 594
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 595
    .line 596
    .line 597
    move-result-object v9

    .line 598
    iget-object v3, v3, Ld1/d;->b:Ljava/lang/String;

    .line 599
    .line 600
    const/4 v10, 0x2

    .line 601
    new-array v10, v10, [Ljava/lang/Object;

    .line 602
    .line 603
    aput-object v9, v10, v16

    .line 604
    .line 605
    aput-object v3, v10, v19

    .line 606
    .line 607
    const-string v3, "Offset: %d, tagName: %s"

    .line 608
    .line 609
    invoke-static {v3, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v3

    .line 613
    invoke-static {v6, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 614
    .line 615
    .line 616
    :cond_20
    const-string v3, ")"

    .line 617
    .line 618
    const/4 v9, -0x1

    .line 619
    cmp-long v10, v7, v17

    .line 620
    .line 621
    if-lez v10, :cond_24

    .line 622
    .line 623
    if-eq v4, v9, :cond_21

    .line 624
    .line 625
    int-to-long v10, v4

    .line 626
    cmp-long v12, v7, v10

    .line 627
    .line 628
    if-gez v12, :cond_24

    .line 629
    .line 630
    :cond_21
    long-to-int v9, v7

    .line 631
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 632
    .line 633
    .line 634
    move-result-object v9

    .line 635
    invoke-virtual {v5, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 636
    .line 637
    .line 638
    move-result v9

    .line 639
    if-nez v9, :cond_23

    .line 640
    .line 641
    invoke-virtual {v1, v7, v8}, Ld1/f;->b(J)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 645
    .line 646
    .line 647
    move-result v2

    .line 648
    invoke-virtual {v0, v1, v2}, Ld1/g;->t(Ld1/f;I)V

    .line 649
    .line 650
    .line 651
    :cond_22
    :goto_13
    move-wide/from16 v10, v33

    .line 652
    .line 653
    goto :goto_14

    .line 654
    :cond_23
    if-eqz v31, :cond_22

    .line 655
    .line 656
    new-instance v9, Ljava/lang/StringBuilder;

    .line 657
    .line 658
    const-string v10, "Skip jump into the IFD since it has already been read: IfdType "

    .line 659
    .line 660
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 664
    .line 665
    .line 666
    const-string v2, " (at "

    .line 667
    .line 668
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v2

    .line 681
    invoke-static {v6, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 682
    .line 683
    .line 684
    goto :goto_13

    .line 685
    :cond_24
    if-eqz v31, :cond_22

    .line 686
    .line 687
    const-string v2, "Skip jump into the IFD since its offset is invalid: "

    .line 688
    .line 689
    invoke-static {v2, v7, v8}, Landroidx/appcompat/app/b;->m(Ljava/lang/String;J)Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object v2

    .line 693
    if-eq v4, v9, :cond_25

    .line 694
    .line 695
    new-instance v7, Ljava/lang/StringBuilder;

    .line 696
    .line 697
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 701
    .line 702
    .line 703
    const-string v2, " (total length: "

    .line 704
    .line 705
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 706
    .line 707
    .line 708
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 712
    .line 713
    .line 714
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 715
    .line 716
    .line 717
    move-result-object v2

    .line 718
    :cond_25
    invoke-static {v6, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 719
    .line 720
    .line 721
    goto :goto_13

    .line 722
    :goto_14
    invoke-virtual {v1, v10, v11}, Ld1/f;->b(J)V

    .line 723
    .line 724
    .line 725
    goto :goto_15

    .line 726
    :cond_26
    move-wide/from16 v10, v33

    .line 727
    .line 728
    iget v2, v1, Ld1/b;->i:I

    .line 729
    .line 730
    iget v9, v0, Ld1/g;->h:I

    .line 731
    .line 732
    add-int/2addr v2, v9

    .line 733
    long-to-int v8, v7

    .line 734
    new-array v7, v8, [B

    .line 735
    .line 736
    invoke-virtual {v1, v7}, Ld1/b;->readFully([B)V

    .line 737
    .line 738
    .line 739
    new-instance v19, Ld1/c;

    .line 740
    .line 741
    int-to-long v8, v2

    .line 742
    move-object/from16 v22, v7

    .line 743
    .line 744
    move/from16 v23, v12

    .line 745
    .line 746
    move/from16 v24, v21

    .line 747
    .line 748
    move-wide/from16 v20, v8

    .line 749
    .line 750
    invoke-direct/range {v19 .. v24}, Ld1/c;-><init>(J[BII)V

    .line 751
    .line 752
    .line 753
    move-object/from16 v2, v19

    .line 754
    .line 755
    aget-object v7, v32, p2

    .line 756
    .line 757
    iget-object v3, v3, Ld1/d;->b:Ljava/lang/String;

    .line 758
    .line 759
    invoke-virtual {v7, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    const-string v7, "DNGVersion"

    .line 763
    .line 764
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 765
    .line 766
    .line 767
    move-result v7

    .line 768
    if-eqz v7, :cond_27

    .line 769
    .line 770
    const/4 v8, 0x3

    .line 771
    iput v8, v0, Ld1/g;->c:I

    .line 772
    .line 773
    :cond_27
    const-string v7, "Make"

    .line 774
    .line 775
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 776
    .line 777
    .line 778
    move-result v7

    .line 779
    if-nez v7, :cond_28

    .line 780
    .line 781
    const-string v7, "Model"

    .line 782
    .line 783
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 784
    .line 785
    .line 786
    move-result v7

    .line 787
    if-eqz v7, :cond_29

    .line 788
    .line 789
    :cond_28
    iget-object v7, v0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 790
    .line 791
    invoke-virtual {v2, v7}, Ld1/c;->f(Ljava/nio/ByteOrder;)Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v7

    .line 795
    const-string v8, "PENTAX"

    .line 796
    .line 797
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 798
    .line 799
    .line 800
    move-result v7

    .line 801
    if-nez v7, :cond_2a

    .line 802
    .line 803
    :cond_29
    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 804
    .line 805
    .line 806
    move-result v3

    .line 807
    if-eqz v3, :cond_2b

    .line 808
    .line 809
    iget-object v3, v0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 810
    .line 811
    invoke-virtual {v2, v3}, Ld1/c;->e(Ljava/nio/ByteOrder;)I

    .line 812
    .line 813
    .line 814
    move-result v2

    .line 815
    const v3, 0xffff

    .line 816
    .line 817
    .line 818
    if-ne v2, v3, :cond_2b

    .line 819
    .line 820
    :cond_2a
    const/16 v8, 0x8

    .line 821
    .line 822
    iput v8, v0, Ld1/g;->c:I

    .line 823
    .line 824
    :cond_2b
    iget v2, v1, Ld1/b;->i:I

    .line 825
    .line 826
    int-to-long v2, v2

    .line 827
    cmp-long v7, v2, v10

    .line 828
    .line 829
    if-eqz v7, :cond_2c

    .line 830
    .line 831
    invoke-virtual {v1, v10, v11}, Ld1/f;->b(J)V

    .line 832
    .line 833
    .line 834
    :cond_2c
    :goto_15
    add-int/lit8 v9, v29, 0x1

    .line 835
    .line 836
    int-to-short v9, v9

    .line 837
    move/from16 v2, p2

    .line 838
    .line 839
    move/from16 v3, v25

    .line 840
    .line 841
    move/from16 v7, v31

    .line 842
    .line 843
    goto/16 :goto_0

    .line 844
    .line 845
    :cond_2d
    move/from16 v31, v7

    .line 846
    .line 847
    move-object/from16 v32, v14

    .line 848
    .line 849
    const/16 v16, 0x0

    .line 850
    .line 851
    const-wide/16 v17, 0x0

    .line 852
    .line 853
    const/16 v19, 0x1

    .line 854
    .line 855
    invoke-virtual {v1}, Ld1/b;->readInt()I

    .line 856
    .line 857
    .line 858
    move-result v2

    .line 859
    if-eqz v31, :cond_2e

    .line 860
    .line 861
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 862
    .line 863
    .line 864
    move-result-object v3

    .line 865
    const/4 v4, 0x1

    .line 866
    new-array v4, v4, [Ljava/lang/Object;

    .line 867
    .line 868
    aput-object v3, v4, v16

    .line 869
    .line 870
    const-string v3, "nextIfdOffset: %d"

    .line 871
    .line 872
    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 873
    .line 874
    .line 875
    move-result-object v3

    .line 876
    invoke-static {v6, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 877
    .line 878
    .line 879
    :cond_2e
    int-to-long v3, v2

    .line 880
    cmp-long v7, v3, v17

    .line 881
    .line 882
    if-lez v7, :cond_31

    .line 883
    .line 884
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 885
    .line 886
    .line 887
    move-result-object v7

    .line 888
    invoke-virtual {v5, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 889
    .line 890
    .line 891
    move-result v5

    .line 892
    if-nez v5, :cond_30

    .line 893
    .line 894
    invoke-virtual {v1, v3, v4}, Ld1/f;->b(J)V

    .line 895
    .line 896
    .line 897
    const/4 v8, 0x4

    .line 898
    aget-object v2, v32, v8

    .line 899
    .line 900
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 901
    .line 902
    .line 903
    move-result v2

    .line 904
    if-eqz v2, :cond_2f

    .line 905
    .line 906
    invoke-virtual {v0, v1, v8}, Ld1/g;->t(Ld1/f;I)V

    .line 907
    .line 908
    .line 909
    return-void

    .line 910
    :cond_2f
    const/4 v7, 0x5

    .line 911
    aget-object v2, v32, v7

    .line 912
    .line 913
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 914
    .line 915
    .line 916
    move-result v2

    .line 917
    if-eqz v2, :cond_32

    .line 918
    .line 919
    invoke-virtual {v0, v1, v7}, Ld1/g;->t(Ld1/f;I)V

    .line 920
    .line 921
    .line 922
    return-void

    .line 923
    :cond_30
    if-eqz v31, :cond_32

    .line 924
    .line 925
    new-instance v1, Ljava/lang/StringBuilder;

    .line 926
    .line 927
    const-string v3, "Stop reading file since re-reading an IFD may cause an infinite loop: "

    .line 928
    .line 929
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 930
    .line 931
    .line 932
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 933
    .line 934
    .line 935
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 936
    .line 937
    .line 938
    move-result-object v1

    .line 939
    invoke-static {v6, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 940
    .line 941
    .line 942
    return-void

    .line 943
    :cond_31
    if-eqz v31, :cond_32

    .line 944
    .line 945
    new-instance v1, Ljava/lang/StringBuilder;

    .line 946
    .line 947
    const-string v3, "Stop reading file since a wrong offset may cause an infinite loop: "

    .line 948
    .line 949
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 950
    .line 951
    .line 952
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 953
    .line 954
    .line 955
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 956
    .line 957
    .line 958
    move-result-object v1

    .line 959
    invoke-static {v6, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 960
    .line 961
    .line 962
    :cond_32
    :goto_16
    return-void
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    .line 3260
    .line 3261
    .line 3262
    .line 3263
    .line 3264
    .line 3265
    .line 3266
    .line 3267
    .line 3268
    .line 3269
    .line 3270
    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    .line 3276
    .line 3277
    .line 3278
    .line 3279
    .line 3280
    .line 3281
    .line 3282
    .line 3283
    .line 3284
    .line 3285
    .line 3286
    .line 3287
    .line 3288
    .line 3289
    .line 3290
    .line 3291
    .line 3292
    .line 3293
    .line 3294
    .line 3295
    .line 3296
    .line 3297
    .line 3298
    .line 3299
    .line 3300
    .line 3301
    .line 3302
    .line 3303
    .line 3304
    .line 3305
    .line 3306
    .line 3307
    .line 3308
    .line 3309
    .line 3310
    .line 3311
    .line 3312
    .line 3313
    .line 3314
    .line 3315
    .line 3316
    .line 3317
    .line 3318
    .line 3319
    .line 3320
    .line 3321
    .line 3322
    .line 3323
    .line 3324
    .line 3325
    .line 3326
    .line 3327
    .line 3328
    .line 3329
    .line 3330
    .line 3331
    .line 3332
    .line 3333
    .line 3334
    .line 3335
    .line 3336
    .line 3337
    .line 3338
    .line 3339
    .line 3340
    .line 3341
    .line 3342
    .line 3343
    .line 3344
    .line 3345
    .line 3346
    .line 3347
    .line 3348
    .line 3349
    .line 3350
    .line 3351
    .line 3352
    .line 3353
    .line 3354
    .line 3355
    .line 3356
    .line 3357
    .line 3358
    .line 3359
    .line 3360
    .line 3361
    .line 3362
    .line 3363
    .line 3364
    .line 3365
    .line 3366
    .line 3367
    .line 3368
    .line 3369
    .line 3370
    .line 3371
    .line 3372
    .line 3373
    .line 3374
    .line 3375
    .line 3376
    .line 3377
    .line 3378
.end method

.method public final u(ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ld1/g;->d:[Ljava/util/HashMap;

    .line 2
    .line 3
    aget-object v1, v0, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    aget-object v1, v0, p1

    .line 12
    .line 13
    invoke-virtual {v1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    aget-object v1, v0, p1

    .line 20
    .line 21
    invoke-virtual {v1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, p3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    aget-object p1, v0, p1

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
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

.method public final v(Ld1/b;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ld1/g;->d:[Ljava/util/HashMap;

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    aget-object v2, v2, v3

    .line 9
    .line 10
    const-string v3, "Compression"

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Ld1/c;

    .line 17
    .line 18
    if-eqz v3, :cond_10

    .line 19
    .line 20
    iget-object v4, v0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 21
    .line 22
    invoke-virtual {v3, v4}, Ld1/c;->e(Ljava/nio/ByteOrder;)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v4, 0x6

    .line 27
    const/4 v5, 0x1

    .line 28
    if-eq v3, v5, :cond_1

    .line 29
    .line 30
    if-eq v3, v4, :cond_0

    .line 31
    .line 32
    const/4 v6, 0x7

    .line 33
    if-eq v3, v6, :cond_1

    .line 34
    .line 35
    goto/16 :goto_5

    .line 36
    .line 37
    :cond_0
    invoke-virtual {v0, v1, v2}, Ld1/g;->n(Ld1/b;Ljava/util/HashMap;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    const-string v3, "BitsPerSample"

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Ld1/c;

    .line 48
    .line 49
    const-string v6, "ExifInterface"

    .line 50
    .line 51
    if-eqz v3, :cond_e

    .line 52
    .line 53
    iget-object v7, v0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 54
    .line 55
    invoke-virtual {v3, v7}, Ld1/c;->g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, [I

    .line 60
    .line 61
    sget-object v7, Ld1/g;->o:[I

    .line 62
    .line 63
    invoke-static {v7, v3}, Ljava/util/Arrays;->equals([I[I)Z

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    if-eqz v8, :cond_2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    iget v8, v0, Ld1/g;->c:I

    .line 71
    .line 72
    const/4 v9, 0x3

    .line 73
    if-ne v8, v9, :cond_e

    .line 74
    .line 75
    const-string v8, "PhotometricInterpretation"

    .line 76
    .line 77
    invoke-virtual {v2, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    check-cast v8, Ld1/c;

    .line 82
    .line 83
    if-eqz v8, :cond_e

    .line 84
    .line 85
    iget-object v9, v0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 86
    .line 87
    invoke-virtual {v8, v9}, Ld1/c;->e(Ljava/nio/ByteOrder;)I

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    if-ne v8, v5, :cond_3

    .line 92
    .line 93
    sget-object v9, Ld1/g;->p:[I

    .line 94
    .line 95
    invoke-static {v3, v9}, Ljava/util/Arrays;->equals([I[I)Z

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    if-nez v9, :cond_4

    .line 100
    .line 101
    :cond_3
    if-ne v8, v4, :cond_e

    .line 102
    .line 103
    invoke-static {v3, v7}, Ljava/util/Arrays;->equals([I[I)Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_e

    .line 108
    .line 109
    :cond_4
    :goto_0
    const-string v3, " bytes."

    .line 110
    .line 111
    const-string v4, "StripOffsets"

    .line 112
    .line 113
    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    check-cast v4, Ld1/c;

    .line 118
    .line 119
    const-string v7, "StripByteCounts"

    .line 120
    .line 121
    invoke-virtual {v2, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    check-cast v2, Ld1/c;

    .line 126
    .line 127
    if-eqz v4, :cond_f

    .line 128
    .line 129
    if-eqz v2, :cond_f

    .line 130
    .line 131
    iget-object v7, v0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 132
    .line 133
    invoke-virtual {v4, v7}, Ld1/c;->g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-static {v4}, Le6/l;->f(Ljava/io/Serializable;)[J

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    iget-object v7, v0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 142
    .line 143
    invoke-virtual {v2, v7}, Ld1/c;->g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-static {v2}, Le6/l;->f(Ljava/io/Serializable;)[J

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    if-eqz v4, :cond_d

    .line 152
    .line 153
    array-length v7, v4

    .line 154
    if-nez v7, :cond_5

    .line 155
    .line 156
    goto/16 :goto_4

    .line 157
    .line 158
    :cond_5
    if-eqz v2, :cond_c

    .line 159
    .line 160
    array-length v7, v2

    .line 161
    if-nez v7, :cond_6

    .line 162
    .line 163
    goto/16 :goto_3

    .line 164
    .line 165
    :cond_6
    array-length v7, v4

    .line 166
    array-length v8, v2

    .line 167
    if-eq v7, v8, :cond_7

    .line 168
    .line 169
    const-string v1, "stripOffsets and stripByteCounts should have same length."

    .line 170
    .line 171
    invoke-static {v6, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 172
    .line 173
    .line 174
    goto/16 :goto_5

    .line 175
    .line 176
    :cond_7
    array-length v7, v2

    .line 177
    const/4 v8, 0x0

    .line 178
    const-wide/16 v9, 0x0

    .line 179
    .line 180
    const/4 v11, 0x0

    .line 181
    :goto_1
    if-ge v11, v7, :cond_8

    .line 182
    .line 183
    aget-wide v12, v2, v11

    .line 184
    .line 185
    add-long/2addr v9, v12

    .line 186
    add-int/lit8 v11, v11, 0x1

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_8
    long-to-int v7, v9

    .line 190
    new-array v7, v7, [B

    .line 191
    .line 192
    iput-boolean v5, v0, Ld1/g;->g:Z

    .line 193
    .line 194
    const/4 v9, 0x0

    .line 195
    const/4 v10, 0x0

    .line 196
    const/4 v11, 0x0

    .line 197
    :goto_2
    array-length v12, v4

    .line 198
    if-ge v9, v12, :cond_b

    .line 199
    .line 200
    aget-wide v12, v4, v9

    .line 201
    .line 202
    long-to-int v13, v12

    .line 203
    aget-wide v14, v2, v9

    .line 204
    .line 205
    long-to-int v12, v14

    .line 206
    array-length v14, v4

    .line 207
    sub-int/2addr v14, v5

    .line 208
    if-ge v9, v14, :cond_9

    .line 209
    .line 210
    add-int v14, v13, v12

    .line 211
    .line 212
    int-to-long v14, v14

    .line 213
    add-int/lit8 v16, v9, 0x1

    .line 214
    .line 215
    aget-wide v16, v4, v16

    .line 216
    .line 217
    cmp-long v18, v14, v16

    .line 218
    .line 219
    if-eqz v18, :cond_9

    .line 220
    .line 221
    iput-boolean v8, v0, Ld1/g;->g:Z

    .line 222
    .line 223
    :cond_9
    sub-int/2addr v13, v10

    .line 224
    if-gez v13, :cond_a

    .line 225
    .line 226
    const-string v1, "Invalid strip offset value"

    .line 227
    .line 228
    invoke-static {v6, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 229
    .line 230
    .line 231
    goto :goto_5

    .line 232
    :cond_a
    :try_start_0
    invoke-virtual {v1, v13}, Ld1/b;->a(I)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_1

    .line 233
    .line 234
    .line 235
    add-int/2addr v10, v13

    .line 236
    new-array v13, v12, [B

    .line 237
    .line 238
    :try_start_1
    invoke-virtual {v1, v13}, Ld1/b;->readFully([B)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0

    .line 239
    .line 240
    .line 241
    add-int/2addr v10, v12

    .line 242
    invoke-static {v13, v8, v7, v11, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 243
    .line 244
    .line 245
    add-int/2addr v11, v12

    .line 246
    add-int/lit8 v9, v9, 0x1

    .line 247
    .line 248
    goto :goto_2

    .line 249
    :catch_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    const-string v2, "Failed to read "

    .line 252
    .line 253
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-static {v6, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 267
    .line 268
    .line 269
    goto :goto_5

    .line 270
    :catch_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 271
    .line 272
    const-string v2, "Failed to skip "

    .line 273
    .line 274
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    invoke-static {v6, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 288
    .line 289
    .line 290
    goto :goto_5

    .line 291
    :cond_b
    iget-boolean v1, v0, Ld1/g;->g:Z

    .line 292
    .line 293
    if-eqz v1, :cond_f

    .line 294
    .line 295
    aget-wide v1, v4, v8

    .line 296
    .line 297
    goto :goto_5

    .line 298
    :cond_c
    :goto_3
    const-string v1, "stripByteCounts should not be null or have zero length."

    .line 299
    .line 300
    invoke-static {v6, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 301
    .line 302
    .line 303
    goto :goto_5

    .line 304
    :cond_d
    :goto_4
    const-string v1, "stripOffsets should not be null or have zero length."

    .line 305
    .line 306
    invoke-static {v6, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 307
    .line 308
    .line 309
    goto :goto_5

    .line 310
    :cond_e
    sget-boolean v1, Ld1/g;->l:Z

    .line 311
    .line 312
    if-eqz v1, :cond_f

    .line 313
    .line 314
    const-string v1, "Unsupported data type value"

    .line 315
    .line 316
    invoke-static {v6, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 317
    .line 318
    .line 319
    :cond_f
    :goto_5
    return-void

    .line 320
    :cond_10
    invoke-virtual {v0, v1, v2}, Ld1/g;->n(Ld1/b;Ljava/util/HashMap;)V

    .line 321
    .line 322
    .line 323
    return-void
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
.end method

.method public final w(II)V
    .locals 8

    .line 1
    iget-object v0, p0, Ld1/g;->d:[Ljava/util/HashMap;

    .line 2
    .line 3
    aget-object v1, v0, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-string v2, "ExifInterface"

    .line 10
    .line 11
    sget-boolean v3, Ld1/g;->l:Z

    .line 12
    .line 13
    if-nez v1, :cond_5

    .line 14
    .line 15
    aget-object v1, v0, p2

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_0
    aget-object v1, v0, p1

    .line 25
    .line 26
    const-string v4, "ImageLength"

    .line 27
    .line 28
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ld1/c;

    .line 33
    .line 34
    aget-object v5, v0, p1

    .line 35
    .line 36
    const-string v6, "ImageWidth"

    .line 37
    .line 38
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Ld1/c;

    .line 43
    .line 44
    aget-object v7, v0, p2

    .line 45
    .line 46
    invoke-virtual {v7, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Ld1/c;

    .line 51
    .line 52
    aget-object v7, v0, p2

    .line 53
    .line 54
    invoke-virtual {v7, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    check-cast v6, Ld1/c;

    .line 59
    .line 60
    if-eqz v1, :cond_4

    .line 61
    .line 62
    if-nez v5, :cond_1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    if-eqz v4, :cond_3

    .line 66
    .line 67
    if-nez v6, :cond_2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    iget-object v2, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 71
    .line 72
    invoke-virtual {v1, v2}, Ld1/c;->e(Ljava/nio/ByteOrder;)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    iget-object v2, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 77
    .line 78
    invoke-virtual {v5, v2}, Ld1/c;->e(Ljava/nio/ByteOrder;)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    iget-object v3, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 83
    .line 84
    invoke-virtual {v4, v3}, Ld1/c;->e(Ljava/nio/ByteOrder;)I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    iget-object v4, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 89
    .line 90
    invoke-virtual {v6, v4}, Ld1/c;->e(Ljava/nio/ByteOrder;)I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-ge v1, v3, :cond_6

    .line 95
    .line 96
    if-ge v2, v4, :cond_6

    .line 97
    .line 98
    aget-object v1, v0, p1

    .line 99
    .line 100
    aget-object v2, v0, p2

    .line 101
    .line 102
    aput-object v2, v0, p1

    .line 103
    .line 104
    aput-object v1, v0, p2

    .line 105
    .line 106
    return-void

    .line 107
    :cond_3
    :goto_0
    if-eqz v3, :cond_6

    .line 108
    .line 109
    const-string p1, "Second image does not contain valid size information"

    .line 110
    .line 111
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_4
    :goto_1
    if-eqz v3, :cond_6

    .line 116
    .line 117
    const-string p1, "First image does not contain valid size information"

    .line 118
    .line 119
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_5
    :goto_2
    if-eqz v3, :cond_6

    .line 124
    .line 125
    const-string p1, "Cannot perform swap since only one image data exists"

    .line 126
    .line 127
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    :cond_6
    return-void
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
.end method

.method public final x(Ld1/f;I)V
    .locals 10

    .line 1
    iget-object v0, p0, Ld1/g;->d:[Ljava/util/HashMap;

    .line 2
    .line 3
    aget-object v1, v0, p2

    .line 4
    .line 5
    const-string v2, "DefaultCropSize"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Ld1/c;

    .line 12
    .line 13
    aget-object v2, v0, p2

    .line 14
    .line 15
    const-string v3, "SensorTopBorder"

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ld1/c;

    .line 22
    .line 23
    aget-object v3, v0, p2

    .line 24
    .line 25
    const-string v4, "SensorLeftBorder"

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ld1/c;

    .line 32
    .line 33
    aget-object v4, v0, p2

    .line 34
    .line 35
    const-string v5, "SensorBottomBorder"

    .line 36
    .line 37
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Ld1/c;

    .line 42
    .line 43
    aget-object v5, v0, p2

    .line 44
    .line 45
    const-string v6, "SensorRightBorder"

    .line 46
    .line 47
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, Ld1/c;

    .line 52
    .line 53
    const-string v6, "ImageLength"

    .line 54
    .line 55
    const-string v7, "ImageWidth"

    .line 56
    .line 57
    if-eqz v1, :cond_5

    .line 58
    .line 59
    iget p1, v1, Ld1/c;->a:I

    .line 60
    .line 61
    const/4 v2, 0x5

    .line 62
    const-string v3, "Invalid crop size values. cropSize="

    .line 63
    .line 64
    const-string v4, "ExifInterface"

    .line 65
    .line 66
    const/4 v5, 0x1

    .line 67
    const/4 v8, 0x0

    .line 68
    const/4 v9, 0x2

    .line 69
    if-ne p1, v2, :cond_2

    .line 70
    .line 71
    iget-object p1, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 72
    .line 73
    invoke-virtual {v1, p1}, Ld1/c;->g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, [Ld1/e;

    .line 78
    .line 79
    if-eqz p1, :cond_1

    .line 80
    .line 81
    array-length v1, p1

    .line 82
    if-eq v1, v9, :cond_0

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    aget-object v1, p1, v8

    .line 86
    .line 87
    iget-object v2, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 88
    .line 89
    invoke-static {v1, v2}, Ld1/c;->b(Ld1/e;Ljava/nio/ByteOrder;)Ld1/c;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    aget-object p1, p1, v5

    .line 94
    .line 95
    iget-object v2, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 96
    .line 97
    invoke-static {p1, v2}, Ld1/c;->b(Ld1/e;Ljava/nio/ByteOrder;)Ld1/c;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    goto :goto_1

    .line 102
    :cond_1
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_2
    iget-object p1, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 123
    .line 124
    invoke-virtual {v1, p1}, Ld1/c;->g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    check-cast p1, [I

    .line 129
    .line 130
    if-eqz p1, :cond_4

    .line 131
    .line 132
    array-length v1, p1

    .line 133
    if-eq v1, v9, :cond_3

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_3
    aget v1, p1, v8

    .line 137
    .line 138
    iget-object v2, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 139
    .line 140
    invoke-static {v1, v2}, Ld1/c;->c(ILjava/nio/ByteOrder;)Ld1/c;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    aget p1, p1, v5

    .line 145
    .line 146
    iget-object v2, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 147
    .line 148
    invoke-static {p1, v2}, Ld1/c;->c(ILjava/nio/ByteOrder;)Ld1/c;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    :goto_1
    aget-object v2, v0, p2

    .line 153
    .line 154
    invoke-virtual {v2, v7, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    aget-object p2, v0, p2

    .line 158
    .line 159
    invoke-virtual {p2, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_4
    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :cond_5
    if-eqz v2, :cond_6

    .line 184
    .line 185
    if-eqz v3, :cond_6

    .line 186
    .line 187
    if-eqz v4, :cond_6

    .line 188
    .line 189
    if-eqz v5, :cond_6

    .line 190
    .line 191
    iget-object p1, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 192
    .line 193
    invoke-virtual {v2, p1}, Ld1/c;->e(Ljava/nio/ByteOrder;)I

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    iget-object v1, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 198
    .line 199
    invoke-virtual {v4, v1}, Ld1/c;->e(Ljava/nio/ByteOrder;)I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    iget-object v2, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 204
    .line 205
    invoke-virtual {v5, v2}, Ld1/c;->e(Ljava/nio/ByteOrder;)I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    iget-object v4, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 210
    .line 211
    invoke-virtual {v3, v4}, Ld1/c;->e(Ljava/nio/ByteOrder;)I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    if-le v1, p1, :cond_8

    .line 216
    .line 217
    if-le v2, v3, :cond_8

    .line 218
    .line 219
    sub-int/2addr v1, p1

    .line 220
    sub-int/2addr v2, v3

    .line 221
    iget-object p1, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 222
    .line 223
    invoke-static {v1, p1}, Ld1/c;->c(ILjava/nio/ByteOrder;)Ld1/c;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    iget-object v1, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 228
    .line 229
    invoke-static {v2, v1}, Ld1/c;->c(ILjava/nio/ByteOrder;)Ld1/c;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    aget-object v2, v0, p2

    .line 234
    .line 235
    invoke-virtual {v2, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    aget-object p1, v0, p2

    .line 239
    .line 240
    invoke-virtual {p1, v7, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :cond_6
    aget-object v1, v0, p2

    .line 245
    .line 246
    invoke-virtual {v1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    check-cast v1, Ld1/c;

    .line 251
    .line 252
    aget-object v2, v0, p2

    .line 253
    .line 254
    invoke-virtual {v2, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    check-cast v2, Ld1/c;

    .line 259
    .line 260
    if-eqz v1, :cond_7

    .line 261
    .line 262
    if-nez v2, :cond_8

    .line 263
    .line 264
    :cond_7
    aget-object v1, v0, p2

    .line 265
    .line 266
    const-string v2, "JPEGInterchangeFormat"

    .line 267
    .line 268
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    check-cast v1, Ld1/c;

    .line 273
    .line 274
    aget-object v0, v0, p2

    .line 275
    .line 276
    const-string v2, "JPEGInterchangeFormatLength"

    .line 277
    .line 278
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    check-cast v0, Ld1/c;

    .line 283
    .line 284
    if-eqz v1, :cond_8

    .line 285
    .line 286
    if-eqz v0, :cond_8

    .line 287
    .line 288
    iget-object v0, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 289
    .line 290
    invoke-virtual {v1, v0}, Ld1/c;->e(Ljava/nio/ByteOrder;)I

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    iget-object v2, p0, Ld1/g;->f:Ljava/nio/ByteOrder;

    .line 295
    .line 296
    invoke-virtual {v1, v2}, Ld1/c;->e(Ljava/nio/ByteOrder;)I

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    int-to-long v2, v0

    .line 301
    invoke-virtual {p1, v2, v3}, Ld1/f;->b(J)V

    .line 302
    .line 303
    .line 304
    new-array v1, v1, [B

    .line 305
    .line 306
    invoke-virtual {p1, v1}, Ld1/b;->readFully([B)V

    .line 307
    .line 308
    .line 309
    new-instance p1, Ld1/b;

    .line 310
    .line 311
    invoke-direct {p1, v1}, Ld1/b;-><init>([B)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {p0, p1, v0, p2}, Ld1/g;->f(Ld1/b;II)V

    .line 315
    .line 316
    .line 317
    :cond_8
    return-void
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
.end method

.method public final y()V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x5

    .line 3
    invoke-virtual {p0, v0, v1}, Ld1/g;->w(II)V

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x4

    .line 7
    invoke-virtual {p0, v0, v2}, Ld1/g;->w(II)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1, v2}, Ld1/g;->w(II)V

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, Ld1/g;->d:[Ljava/util/HashMap;

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    aget-object v5, v3, v4

    .line 17
    .line 18
    const-string v6, "PixelXDimension"

    .line 19
    .line 20
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    check-cast v5, Ld1/c;

    .line 25
    .line 26
    aget-object v4, v3, v4

    .line 27
    .line 28
    const-string v6, "PixelYDimension"

    .line 29
    .line 30
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    check-cast v4, Ld1/c;

    .line 35
    .line 36
    const-string v6, "ImageLength"

    .line 37
    .line 38
    const-string v7, "ImageWidth"

    .line 39
    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    aget-object v8, v3, v0

    .line 45
    .line 46
    invoke-virtual {v8, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    aget-object v5, v3, v0

    .line 50
    .line 51
    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    :cond_0
    aget-object v4, v3, v2

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/util/HashMap;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    aget-object v4, v3, v1

    .line 63
    .line 64
    invoke-virtual {p0, v4}, Ld1/g;->o(Ljava/util/HashMap;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_1

    .line 69
    .line 70
    aget-object v4, v3, v1

    .line 71
    .line 72
    aput-object v4, v3, v2

    .line 73
    .line 74
    new-instance v4, Ljava/util/HashMap;

    .line 75
    .line 76
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 77
    .line 78
    .line 79
    aput-object v4, v3, v1

    .line 80
    .line 81
    :cond_1
    aget-object v3, v3, v2

    .line 82
    .line 83
    invoke-virtual {p0, v3}, Ld1/g;->o(Ljava/util/HashMap;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-nez v3, :cond_2

    .line 88
    .line 89
    const-string v3, "ExifInterface"

    .line 90
    .line 91
    const-string v4, "No image meets the size requirements of a thumbnail image."

    .line 92
    .line 93
    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    :cond_2
    const-string v3, "ThumbnailOrientation"

    .line 97
    .line 98
    const-string v4, "Orientation"

    .line 99
    .line 100
    invoke-virtual {p0, v0, v3, v4}, Ld1/g;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const-string v5, "ThumbnailImageLength"

    .line 104
    .line 105
    invoke-virtual {p0, v0, v5, v6}, Ld1/g;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    const-string v8, "ThumbnailImageWidth"

    .line 109
    .line 110
    invoke-virtual {p0, v0, v8, v7}, Ld1/g;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v1, v3, v4}, Ld1/g;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v1, v5, v6}, Ld1/g;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v1, v8, v7}, Ld1/g;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v2, v4, v3}, Ld1/g;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, v2, v6, v5}, Ld1/g;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v2, v7, v8}, Ld1/g;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-void
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
