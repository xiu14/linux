using System.Text.RegularExpressions;
using StardewValley;

namespace Libala.CompanionGuide;

internal sealed class CompanionGiftController
{
    private static readonly string[] PreferredStandardObjectIds =
    {
        "388", // Wood
        "390", // Stone
        "709", // Hardwood
        "771", // Fiber
        "382", // Coal
        "92",  // Sap
        "330", // Clay
        "378", // Copper ore
        "380", // Iron ore
        "384", // Gold ore
        "386", // Iridium ore
        "334", // Copper bar
        "335", // Iron bar
        "336", // Gold bar
        "337"  // Iridium bar
    };

    private static readonly string[] RequestWords =
    {
        "给我",
        "送我",
        "拿给我",
        "帮我拿",
        "我想要",
        "我需要"
    };

    private readonly CompanionStorageController storage;

    public CompanionGiftController(CompanionStorageController storage)
    {
        this.storage = storage;
    }

    public bool TryCreateOffer(string text, out CompanionGiftOffer? offer, out string reply)
    {
        offer = null;
        reply = "";
        string compact = text.Replace(" ", "").Replace("\r", "").Replace("\n", "");
        string? requestWord = RequestWords.FirstOrDefault(compact.Contains);
        if (requestWord is null)
            return false;

        int requestStart = compact.IndexOf(requestWord, StringComparison.Ordinal) + requestWord.Length;
        string request = compact[requestStart..];
        CompanionGiftOffer? matched = this.FindObjectOffer(request);
        if (matched is null)
        {
            reply = "我暂时只能给你普通的背包物品。这次没有认出你要的东西。";
            return true;
        }

        int quantity = this.ReadQuantity(request, matched.DisplayName);
        quantity = Math.Clamp(quantity, 1, 999);
        offer = matched with { Quantity = quantity };
        reply = $"我可以给你 {offer.DisplayName} x{offer.Quantity}。要现在收下吗？";
        return true;
    }

    public string Accept(CompanionGiftOffer offer)
    {
        return this.storage.StoreRequestedGift(offer.QualifiedItemId, offer.DisplayName, offer.Quantity);
    }

    private CompanionGiftOffer? FindObjectOffer(string request)
    {
        IEnumerable<string> objectIds = PreferredStandardObjectIds
            .Where(Game1.objectData.ContainsKey)
            .Concat(Game1.objectData.Keys.Where(id => !PreferredStandardObjectIds.Contains(id, StringComparer.OrdinalIgnoreCase)))
            .OrderByDescending(GetDisplayNameLength);
        foreach (string objectId in objectIds)
        {
            string displayName = GetDisplayName(objectId);
            if (string.IsNullOrWhiteSpace(displayName) || !request.Contains(displayName, StringComparison.CurrentCultureIgnoreCase))
                continue;

            string qualifiedId = ItemRegistry.ManuallyQualifyItemId(objectId, ItemRegistry.type_object);
            Item? item = ItemRegistry.Create(qualifiedId, allowNull: true);
            if (item is StardewValley.Object obj
                && !obj.bigCraftable.Value
                && !obj.questItem.Value
                && !item.specialItem
                && item.canBeTrashed())
                return new CompanionGiftOffer(qualifiedId, item.DisplayName, 1);
        }

        return null;
    }

    private int ReadQuantity(string request, string displayName)
    {
        int itemIndex = request.IndexOf(displayName, StringComparison.CurrentCultureIgnoreCase);
        string before = itemIndex > 0 ? request[..itemIndex] : "";
        string after = itemIndex >= 0 ? request[(itemIndex + displayName.Length)..] : "";
        Match match = Regex.Match(before, @"([0-9]+|[零〇一二两三四五六七八九十百千]+)(?:个|份|块|根|条|颗|瓶|枚|组)?$");
        if (!match.Success)
            match = Regex.Match(after, @"^(?:[xX*×])?([0-9]+|[零〇一二两三四五六七八九十百千]+)");

        return !match.Success ? 1 : ParseQuantity(match.Groups[1].Value);
    }

    private static int ParseQuantity(string value)
    {
        if (int.TryParse(value, out int numeric))
            return numeric;

        Dictionary<char, int> digits = new()
        {
            ['零'] = 0,
            ['〇'] = 0,
            ['一'] = 1,
            ['二'] = 2,
            ['两'] = 2,
            ['三'] = 3,
            ['四'] = 4,
            ['五'] = 5,
            ['六'] = 6,
            ['七'] = 7,
            ['八'] = 8,
            ['九'] = 9
        };
        int total = 0;
        int current = 0;
        foreach (char character in value)
        {
            if (digits.TryGetValue(character, out int digit))
            {
                current = digit;
                continue;
            }

            int unit = character switch
            {
                '十' => 10,
                '百' => 100,
                '千' => 1000,
                _ => 0
            };
            if (unit > 0)
            {
                total += (current == 0 ? 1 : current) * unit;
                current = 0;
            }
        }

        return Math.Max(1, total + current);
    }

    private static string GetDisplayName(string id)
    {
        string qualifiedId = ItemRegistry.ManuallyQualifyItemId(id, ItemRegistry.type_object);
        return ItemRegistry.GetData(qualifiedId)?.DisplayName ?? "";
    }

    private static int GetDisplayNameLength(string id)
    {
        return GetDisplayName(id).Length;
    }
}

internal sealed record CompanionGiftOffer(string QualifiedItemId, string DisplayName, int Quantity);
