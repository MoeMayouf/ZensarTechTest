package com.test.zensartest.presentation.home;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.gson.internal.LinkedTreeMap;
import com.test.zensartest.R;
import com.test.zensartest.data.model.ColorSwatch;
import com.test.zensartest.data.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductViewHolder> {

    private final List<Product> products;

    public ProductsAdapter() {
        this.products = new ArrayList<>();
    }

    public void setData(List<Product> productList) {
        this.products.clear();
        this.products.addAll(productList);
        notifyDataSetChanged();
        //TODO: Implement sorting mechanism
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        return new ProductViewHolder(layoutInflater.inflate(R.layout.row, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder albumViewHolder, int position) {
        albumViewHolder.bind(products.get(position));
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public void addAll(List<Product> products) {
        this.products.addAll(products);
        notifyItemRangeInserted(this.products.size() - products.size(), products.size());
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tvProductId)
        TextView tvProductId;
        @BindView(R.id.tvTitle)
        TextView tvTitle;
        @BindView(R.id.tvNowPrice)
        TextView tvNowPrice;
        @BindView(R.id.tvWasPrice)
        TextView tvWasPrice;
        @BindView(R.id.tvThen1Price)
        TextView tvThenPrice;
        @BindView(R.id.tvDiscount)
        TextView tvDiscount;
        @BindView(R.id.tvRGB)
        TextView tvRGB;
        @BindView(R.id.tvBasicColor)
        TextView tvBasicColor;
        @BindView(R.id.tvSkuID)
        TextView tvSkuId;
        HashMap<String, String> hashMap = new HashMap<>();
        float percentage;


        ProductViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

            hashMap.put("Red", "255, 0 , 0");
            hashMap.put("Blue", "0, 0, 255");
            hashMap.put("Black", "255, 255, 255");
            hashMap.put("Grey", "128, 128, 128");
            hashMap.put("Pink", "255, 192, 203");
            hashMap.put("Green", "0, 255, 0");
            hashMap.put("Multi", "0");
            hashMap.put("Purple", "160, 32, 240");
        }

        void bind(Product product) {
            tvProductId.setText(product.getProductId());
            tvTitle.setText(product.getTitle());
            String nowPrice = "";
            if (product.getPrice().getNow() instanceof String) {
                nowPrice = product.getPrice().getNow().toString();
                tvNowPrice.setText("Now: £" + nowPrice);
            } else if (product.getPrice().getNow() instanceof LinkedTreeMap) {
                Object n = ((LinkedTreeMap) product.getPrice().getNow()).get("to");
                nowPrice = n.toString();
                tvNowPrice.setText("Now: £" + nowPrice);
            }

            tvWasPrice.setText("Was: " + product.getPrice().getWas());
            if (product.getPrice().getThen2().isEmpty()) {
                tvThenPrice.setText("Then: " + product.getPrice().getThen1());
            } else {
                tvThenPrice.setText("Then: " + product.getPrice().getThen2());
            }
            if (product.getColorSwatches().isEmpty()) {
                tvRGB.setText("Empty");
                tvBasicColor.setText("Empty");
                tvSkuId.setText(product.getDefaultSkuId());
            } else {
                String colour = "";
                String rgb = "";
                String skuid = "";
                for (int i = 0; i < product.getColorSwatches().size(); i++) {
                    ColorSwatch position = product.getColorSwatches().get(i);
                    colour = colour + "\n" + position.getColor();
                    rgb = rgb + "\n" + hashMap.get(position.getBasicColor());
                    skuid = skuid + "\n" + position.getSkuId();
                }
                tvRGB.setText(rgb);
                tvBasicColor.setText(colour);
                tvSkuId.setText(skuid);
            }
            if (!product.getPrice().getWas().equals("")) {
                tvDiscount.setVisibility(View.VISIBLE);
                calculateDiscountPercentage(nowPrice, product.getPrice().getWas());
            } else {
                tvDiscount.setVisibility(View.GONE);
            }
        }

        private void calculateDiscountPercentage(String now, String was) {
            float diff = Float.parseFloat(was) - Float.parseFloat(now);
            percentage = (diff / Float.parseFloat(was)) * 100;
            tvDiscount.setText("Discount: " + percentage + "%");
        }
    }
}
